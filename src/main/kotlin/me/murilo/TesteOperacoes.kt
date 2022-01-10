package me.murilo

fun main() {
    var salarios = doubleArrayOf(1000.00, 4220.00, 5100.00)


    for (salario in salarios){
        println(salario)
    }

    println("------------")

    println("Maior salario -> ${salarios.maxOrNull()}")
    println("Menor salario -> ${salarios.minOrNull()}")
    println("Média dos salarios -> ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    println("------------")
    salarioMaiorQue2500.forEach { println(it) }

    println("------------")
    println(salarios.count {it in 2500.0..5000.0} )

    println("------------")
    val finder:Double? = salarios.find { it == 4120.00 }
    println(finder ?: "este salário não existe na lista")
    println(salarios.find { it == 1000.0 })

    println("------------")
    println(salarios.any{ it == 1000.0})

}