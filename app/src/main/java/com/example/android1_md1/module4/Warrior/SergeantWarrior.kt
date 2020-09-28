package com.example.android1_md1.module4.Warrior

import com.example.android1_md1.module4.Configure.AbstractWarrior
import com.example.android1_md1.module4.Configure.Weapons

class SergeantWarrior:AbstractWarrior(
maxHP=150,
evasion=5,
accuracy=90,
weapon= Weapons.pistol
) {
    override fun toString():String{
        return "Sergeant"
    }


}