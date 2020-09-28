package com.example.android1_md1.module4

fun main(){
    println("Введите кол-во войнов")
    val countWarrior= readLine()?.toIntOrNull() ?: return
    val team1=Team(countWarrior)

    val team2=Team(countWarrior)

    val battle=Battle(team1,team2)
    while(!battle.battlefinish){
        battle.fight()
        println(battle.progress())
        println()

    }
}