package me.murilo

fun main() {

    val gui = Funcionario("Guilherme Gustavo", 12300.0, "CLT")
    val joana = Funcionario("Joana Silva", 1500.0, "CLT")
    val amanda = Funcionario("Amanada Antunes", 5500.0, "PJ")
    val mariana = Funcionario("Mariana Manceratti", 8000.0, "CLT")

    val funcionarios = setOf(gui, joana)
    val funcionarios2 = setOf(amanda)

    val union = funcionarios.union(funcionarios2)

    println("union\n")

    union.forEach {
        println(it)
    }

    println("-------------------\nsubtract\n")

    val funcionarios3 = setOf(mariana,amanda)
    val subtraction = funcionarios3.subtract(funcionarios2)

    subtraction.forEach {
        println(it)
    }

    println("-------------------\nintersect\n")

    val intersect = funcionarios3.intersect(funcionarios2)
    intersect.forEach { println(it) }
}