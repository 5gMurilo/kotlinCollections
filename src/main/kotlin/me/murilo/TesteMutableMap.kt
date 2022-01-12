package me.murilo

fun main() {
    val joao = Funcionario(nome = "João José", salario = 2600.0, contratacao="CLT" )
    val pedro = Funcionario("Pedro Pascoal", salario = 1960.0, contratacao="CLT" )
    val maria = Funcionario("Maria Marta", salario = 2900.0, contratacao="PJ" )

    val repositorio = Repositorio<Funcionario>() //intanciando repositório e especificando o generics

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println("------------------------")
    println(repositorio.findById(maria.nome))

    println("------------------------")
    repositorio.findAll().forEach{ println("$it\n") }

    println("------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ println("$it\n") }
}