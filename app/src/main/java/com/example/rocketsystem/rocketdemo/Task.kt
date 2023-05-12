package com.example.rocketsystem.rocketdemo

sealed class Task {
    object PrepareForLaunch : Task()
    object ExecuteMission : Task()
    object ReturnToEarth : Task()
}