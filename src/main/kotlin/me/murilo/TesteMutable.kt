package me.murilo

fun main() {
    val joao = Funcionario(nome = "João José", salario = 2600.0, contratacao="CLT" )
    val pedro = Funcionario("Pedro Pascoal", 1960.0, "CLT" )
    val maria = Funcionario("Maria Marta",  2900.0, "PJ" )

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {
        println(it)
    }

    println("--------------LIST-------------")
    funcionarios
        .add(pedro)
    funcionarios
        .forEach { println(it) }

    println("---------------------------")

    funcionarios
        .remove(joao)
    funcionarios
        .forEach { println(it) }

    println("---------------------------")

    funcionarios
        .groupBy { it.contratacao }
        .forEach { println(it) }

    println("--------------SET-------------")

    val funcionariosSet = mutableSetOf(joao)

    funcionariosSet
        .forEach{println(it)}

    println("---------------------------")
    funcionariosSet
        .add(pedro)
    funcionariosSet
        .add(maria)

    funcionariosSet.forEach { println(it) }

    println("---------------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}