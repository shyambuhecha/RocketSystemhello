package com.example.rocketsystem.rocketdemo

class Main {
}
fun main() {
    val astronaut = Astronaut("Shyam")
    val mission = SampleMission(0.7)
    val rocket = Rocket(RocketController, astronaut)
    val missionControl = MissionControl("ISRO")

    rocket.connectWith(missionControl)

    val isMissionSuccessful = rocket.startMission(mission)
    if (isMissionSuccessful) {
        println("Mission was successful!")
    } else {
        println("Mission failed.")
    }
}

