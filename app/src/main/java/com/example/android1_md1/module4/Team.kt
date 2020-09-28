package com.example.android1_md1.module4

import com.example.android1_md1.module4.Configure.AbstractWarrior
import com.example.android1_md1.module4.Warrior.GeneralWarrior
import com.example.android1_md1.module4.Warrior.LieutenantWarrior
import com.example.android1_md1.module4.Warrior.MajorWarrior
import com.example.android1_md1.module4.Warrior.SergeantWarrior
import kotlin.random.Random

class Team(private val cnt:Int) {
    var listWarrior= mutableListOf<AbstractWarrior>()
        private set
    init {
        completion()
    }

    private fun completion(){
        for(i in 0 until cnt)
            when {
                Random.nextInt(100)<5 -> listWarrior.add(GeneralWarrior())
                Random.nextInt(100)<15 -> listWarrior.add(LieutenantWarrior())
                Random.nextInt(100)<50 -> listWarrior.add(MajorWarrior())
                else -> listWarrior.add(SergeantWarrior())
            }
    }
    fun survive(){
        for(i in listWarrior.size downTo 1)
            if(listWarrior[i-1].iskilled)
                listWarrior.removeAt(i-1)
    }
}