package me.murilo

fun main() {
    val joao = Funcionario(nome = "João José", salario = 2600.0, contratacao="CLT" )
    val pedro = Funcionario("Pedro Pascoal", salario = 1960.0, contratacao="CLT" )
    val maria = Funcionario("Maria Marta", salario = 2900.0, contratacao="PJ" )

    val empresa = listOf(joao, pedro, maria)

    empresa.forEach {
        println(it)
    }

    println("---------------")
    println(empresa.find { it.nome == "Maria Marta"  })

    println("---------------")
    empresa
        .sortedBy{ it.salario }
        .forEach { println(it) }

    println("---------------")

    empresa
        .groupBy{ it.contratacao }
        .forEach { println(it) }


}
