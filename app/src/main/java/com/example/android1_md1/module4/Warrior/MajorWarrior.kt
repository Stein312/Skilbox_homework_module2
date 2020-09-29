package com.example.android1_md1.module4.Warrior

import com.example.android1_md1.module4.Configure.AbstractWarrior
import com.example.android1_md1.module4.Configure.Weapons

class MajorWarrior : AbstractWarrior(
    maxHP = 250,
    evasion = 20,
    accuracy = 85,
    weapon = Weapons.AutoPistol()
) {
    override fun toString(): String {
        return "Major"
    }


}