package com.example.android1_md1.module4.Warrior

import com.example.android1_md1.module4.Configure.AbstractWarrior
import com.example.android1_md1.module4.Configure.Weapons

class LieutenantWarrior: AbstractWarrior(
    maxHP=250,
    evasion=15,
    accuracy=99,
    weapon= Weapons.rifle
) {
    override fun toString():String{
        return "Lieutenant"
    }


}