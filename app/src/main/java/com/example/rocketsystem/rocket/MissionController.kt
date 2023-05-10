package com.example.rocketsystem.rocket

import kotlin.random.Random

class MissionControl(private val mission: Mission) : MissionObserver {
    override fun onLaunchSuccess() {
        println("Mission control: launch successful!")
        val missionBudget = mission.budget
        val actualCost = Random.nextLong(500000, 1500000)
        if (actualCost > missionBudget) {
            println("Mission control: overspent by ${actualCost - missionBudget} dollars!")
        } else {
            println("Mission control: mission was under budget by ${missionBudget - actualCost} dollars!")
        }
    }

    fun notifyLaunchSuccess() {
        onLaunchSuccess()
    }
}