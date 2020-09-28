package com.example.android1_md1.module4.Configure

import com.example.android1_md1.module4.Team

sealed class BattleState(team1: Team, team2: Team) {
    val surviveTeam1=team1.listWarrior.size
    val surviveTeam2=team2.listWarrior.size
    class Progress(team1: Team,team2: Team):BattleState(team1,team2){
        fun get():Boolean{
            return surviveTeam2>0&&surviveTeam1>0
        }

        override fun toString():String{
            return """Team1 - $surviveTeam1 выживших - Team2 - $surviveTeam2 выживших""".trimMargin()
        }
    }
    class OneVin(team1: Team,team2: Team):BattleState(team1,team2){
        fun get():Boolean{
            return surviveTeam1>0&&surviveTeam2<=0
        }
        override fun toString():String{
            return "Победа 1 команды"
        }
    }
    class TwoVin(team1: Team,team2: Team):BattleState(team1,team2){
        fun get():Boolean{
            return surviveTeam2>0&&surviveTeam1<=0
        }
        override fun toString(): String{
            return "Победа 2 команды"
        }
    }
    class Draw(team1: Team,team2: Team):BattleState(team1,team2){
        fun get():Boolean{
            return surviveTeam2<=0&&surviveTeam1<=0
        }
        override fun toString(): String{
            return "Ничья"
        }
    }

}