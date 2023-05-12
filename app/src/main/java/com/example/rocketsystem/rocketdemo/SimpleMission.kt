package com.example.rocketsystem.rocketdemo

data class SampleMission(val successRate: Double) : Mission {
    override fun completeMission(): Boolean {
        println("Mission complete!")
        return Math.random() < successRate
    }
}
