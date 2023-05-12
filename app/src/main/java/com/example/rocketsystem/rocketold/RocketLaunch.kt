package com.example.rocketsystem.rocketold

import kotlin.properties.Delegates
import kotlin.random.Random

class RocketLaunch
    (private val rocket: Rocket, private val observer: LaunchObserver) {
    var countdown by Delegates.observable(10) { _, oldVal, newVal ->
        println("Countdown: $newVal")
        if (newVal == 0) {
            igniteRocket()
        }
    }

    fun startLaunchSequence() {
        val astronaut = Astronaut("John")
        astronaut.performPreLaunchChecklist()
        Thread {
            repeat(10) { i ->
                Thread.sleep(1000)
                countdown = 10 - i
            }
            if (countdown > 0) {
                observer.onLaunchAborted(LaunchResult(false, "Launch aborted: countdown interrupted"))
                return@Thread
            }
        }.start()
    }

    private fun igniteRocket() {
        val controller = RocketController(rocket)
        controller.igniteEngines()
        val launchResult = LaunchResult(Random.nextBoolean(), if (Random.nextBoolean()) "Engine failure detected" else "No issues detected")
        launchResult.apply {
            if (!success) {
                observer.onLaunchAborted(this)
                return
            }
        }
        MissionControl(Mission("Mars mission", 10000000)).also {
            it.notifyLaunchSuccess()
        }
    }
}