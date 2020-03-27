package com.example.android1_md1

fun main() {
    print("Введите колличество чисел-")
    val n = readLine()?.toIntOrNull() ?: return
    var current = 0

    val list = printNumber(n)
    list.forEach {
        if (it > 0) {
            current ++
        }
    }
    println("Количество положительных чисел = $current")
    println("Количестов четных чисел = ${list.count {it%2==0}}")
    val set= setOf<Int>().union(list)
    println("Количество уникальных чисел = ${set.size}")
    val sum=list.sum()
    println("Сумма= $sum")
    val map= mutableMapOf<Int,Int>()
    set.forEach { map[it]=nOD(it,sum)
    }
    for(key in map.keys){
        println("Число <$key>, Сумма<$sum>, НОД <${map[key]}>")
    }
}
tailrec fun nOD(a:Int, b: Int): Int{
    if(b==0) return a
    return nOD(b,a%b)
}
fun printNumber(n: Int): List<Int> {
    val list = mutableListOf<Int>()
    var currentNumber = 1
    while (currentNumber <= n) {
        print("Введите число-")
        val number = readLine()?.toIntOrNull()
        if (number != null) {
            list.add(number)
            println("Вы ввели число $number")
            currentNumber++
        }
    }

    return list.toList()
}