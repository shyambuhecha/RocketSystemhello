package com.example.rocketsystem.rocket

class MissionControl(private val mission: Mission) {

    private val budgetOfAstronaut = mission.budgetOfAstronaut
    private val budgetOfMission = (1800..2000).random()
    private val isMissionSuccess = MissionObserver{
        budgetOfAstronaut > budgetOfMission
    }

    fun notifyLaunchSuccess() {
        if(isMissionSuccess.onLaunchSuccess()) println(MissionStatus.LAUNCHED) else println(MissionStatus.NOT_LAUNCHED)
    }
}