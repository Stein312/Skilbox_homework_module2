package com.example.android1_md1.module4.Configure

import kotlin.random.Random

enum class Ammo(
    private val damage:Int,
    private val shancecriticalStrike:Int,
    private val rationCriticalStrike:Int

){
    Pistol(30,25,2),
    Rifle (150,50,4),
    MachineGun (50,30,3);

    fun currentDamage(ammo: Ammo):Int=if(Random.nextInt(101)<ammo.shancecriticalStrike)
        ammo.damage+ammo.damage*ammo.rationCriticalStrike
    else ammo.damage
}