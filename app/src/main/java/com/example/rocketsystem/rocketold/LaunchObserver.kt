package com.example.rocketsystem.rocketold

interface LaunchObserver {
    fun onLaunchAborted(result: LaunchResult)
}