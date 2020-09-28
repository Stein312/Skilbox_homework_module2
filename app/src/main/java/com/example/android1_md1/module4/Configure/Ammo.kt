package com.example.android1_md1.module4.Configure

import kotlin.random.Random

enum class Ammo(
    private val damage:Int,
    private val shancecriticalStrike:Int,
    private val rationCriticalStrike:Int

){
    Pistol(damage = 100,shancecriticalStrike = 25,rationCriticalStrike = 3),
    AutoPistol(damage = 30,shancecriticalStrike = 10,rationCriticalStrike = 2),
    Rifle (damage=150,shancecriticalStrike = 30, rationCriticalStrike = 4);

    fun currentDamage():Int=if(Random.nextInt(101)<shancecriticalStrike)
        damage+damage*rationCriticalStrike
    else damage
}