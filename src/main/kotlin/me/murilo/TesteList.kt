package me.murilo

fun main() {
    val joao = Funcionario(nome = "João José", salario = 2600.0)
    val pedro = Funcionario("Pedro Pascoal", salario = 1960.0)
    val maria = Funcionario("Maria Marta", salario = 2600.0)

    val empresa = listOf(joao, pedro, maria)

    empresa.forEach {
        println(it)
    }

    println("---------------")
    println(empresa.find { it.nome == "Maria Marta"  })
}

data class Funcionario(
    val nome:String,
    val salario:Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()

}