package com.example.android1_md1.module4

import com.example.android1_md1.module4.Configure.AbstractWarrior
import com.example.android1_md1.module4.Configure.BattleState
import com.example.android1_md1.module4.Configure.BattleState.Progress

class Battle(val team1: Team,val team2: Team) {
    var battlefinish=false
    fun progress():BattleState{
        val prog=Progress(this.team1, this.team2)
        return when {
            prog.get() -> {
                prog
            }
            BattleState.OneVin(this.team1,this.team2).get() -> {
                battlefinish=true
                BattleState.OneVin(this.team1,this.team2)
                }
            BattleState.TwoVin(this.team1,this.team2).get() ->{
                battlefinish=true
                BattleState.TwoVin(this.team1,this.team2)
            }
            else -> {
                battlefinish=true
                BattleState.Draw(this.team1,this.team2)
            }
        }
    }
    fun fight() {
        val team1=this.team1.listWarrior
        val team2=this.team2.listWarrior
        team1.shuffled()
        team2.shuffled()

        if(team1.size<=team2.size)
            for(i in 0 until team1.size){
                team1[i].attack(team2[i])
                team2[i].attack(team1[i])
                println("${team1[i]}-${team1[i].HP} против ${team2[i]}-${team2[i].HP} ")

            }
        else for(i in 0 until team2.size){
            team2[i].attack(team1[i])
            team1[i].attack(team2[i])
            println("${team1[i]}-${team1[i].HP} против ${team2[i]}-${team2[i].HP} ")

        }
        this.team2.survive()
        this.team1.survive()
    }
}