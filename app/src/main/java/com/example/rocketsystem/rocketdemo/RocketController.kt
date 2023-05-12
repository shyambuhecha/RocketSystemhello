package com.example.rocketsystem.rocketdemo

object RocketController {
    fun launch() {
        println("Rocket launched!")
    }

    fun connectWith(missionControl: MissionControl) {
        println("Connect with ${missionControl.nameOfMissionControllerCompany}...")
        // perform the docking maneuver here
        println("Connection successful!")
    }
}