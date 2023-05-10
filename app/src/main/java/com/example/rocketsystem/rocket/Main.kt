package com.example.rocketsystem.rocket

fun main() {
    val rocket = Rocket("Falcon 9")
    RocketLaunch(rocket, object : LaunchObserver {
        override fun onLaunchAborted(result: LaunchResult) {
            println("Launch sequence aborted: ${result.message}")
        }
    }).startLaunchSequence()
}