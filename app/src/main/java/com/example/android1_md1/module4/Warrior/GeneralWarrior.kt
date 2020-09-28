package com.example.android1_md1.module4.Warrior

import com.example.android1_md1.module4.Configure.AbstractWarrior
import com.example.android1_md1.module4.Configure.AbstractWeapon
import com.example.android1_md1.module4.Configure.Weapons

class GeneralWarrior:AbstractWarrior(
    maxHP=300,
    evasion=35,
    accuracy=95,
    weapon=Weapons.rifle
) {
    override fun toString():String{
        return "General"
    }


}