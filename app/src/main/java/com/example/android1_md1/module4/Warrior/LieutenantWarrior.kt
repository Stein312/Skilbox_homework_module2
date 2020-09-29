package com.example.android1_md1.module4.Warrior

import com.example.android1_md1.module4.Configure.AbstractWarrior
import com.example.android1_md1.module4.Configure.Weapons

class LieutenantWarrior : AbstractWarrior(
    maxHP = 300,
    evasion = 15,
    accuracy = 90,
    weapon = Weapons.Rifle()
) {
    override fun toString(): String {
        return "Lieutenant"
    }


}