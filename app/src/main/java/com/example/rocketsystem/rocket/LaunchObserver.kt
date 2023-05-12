package com.example.rocketsystem.rocket

interface LaunchObserver {
    fun onLaunchAborted(result: OnLaunchResult)
}