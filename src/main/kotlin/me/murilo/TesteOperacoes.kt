package me.murilo

fun main() {
    var salarios = doubleArrayOf(1000.00, 4220.00, 5100.00)


    for (salario in salarios){
        println(salario)
    }

    println("------------")

    println("Maior salario -> ${salarios.maxOf { d: Double -> d }}")
    println("Menor salario -> ${salarios.minOf {d: Double -> d}}")
    println("Média dos salarios -> ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    println("------------")

    salarioMaiorQue2500.forEach { println(it) }
}