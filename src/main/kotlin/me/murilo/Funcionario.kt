package me.murilo

data class Funcionario(
    val nome:String,
    val salario:Double,
    val contratacao:String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}