package com.example.android1_md1.module4.Warrior

import com.example.android1_md1.module4.Configure.AbstractWarrior
import com.example.android1_md1.module4.Configure.AbstractWeapon
import com.example.android1_md1.module4.Configure.Weapons

class GeneralWarrior:AbstractWarrior(
    maxHP=800,
    evasion=25,
    accuracy=100,
    weapon=Weapons.Rifle()
) {
    override fun toString():String{
        return "General"
    }


}