package me.murilo

fun main() {
    val values = intArrayOf(1,23,4,7,21)

    values.forEach {
        println(it)
    }

    println("--------------")

    for (value in values){
        println(value)
    }

    println("--------------")

    values.sort()
    values.forEach { value -> println(value) }

}