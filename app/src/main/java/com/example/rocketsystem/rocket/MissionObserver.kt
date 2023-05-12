package com.example.rocketsystem.rocket

fun interface MissionObserver {
    fun onLaunchSuccess(): Boolean
}