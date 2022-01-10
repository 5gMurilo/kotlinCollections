package me.murilo

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.00
    salarios[1] = 2000.00
    salarios[2] = 1400.00

    salarios.forEach { salario -> println(salario) }

    println("------------")

    salarios.forEachIndexed { index, salario -> println("${index+1} - $salario ") }

    println("------------")

    salarios.forEachIndexed { index, new -> println("${index+1} - ${new + (new * 0.1)} ") }


    val salarios2 = doubleArrayOf(1234.0 , 2350.0, 5422.0 )
    salarios2.sort()

    println("------------")
    println("------------")

    salarios2.forEach { salario -> println(salario) }

}