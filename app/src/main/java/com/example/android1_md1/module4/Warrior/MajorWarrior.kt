package com.example.android1_md1.module4.Warrior

import com.example.android1_md1.module4.Configure.AbstractWarrior
import com.example.android1_md1.module4.Configure.Weapons

class MajorWarrior: AbstractWarrior(
    maxHP=200,
    evasion=10,
    accuracy=85,
    weapon= Weapons.autoPistol
) {
    override fun toString():String{
        return "Major"
    }


}