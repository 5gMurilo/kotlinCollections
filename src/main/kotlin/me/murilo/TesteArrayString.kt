package me.murilo

fun main() {
    val nomes = Array(3) {""}

    nomes[0] = "maria"
    nomes[1] = "João"
    nomes[2] = "josé"

    for (nome in nomes){
        println(nome)
    }

    println("-----------------")

    nomes.forEach { name -> println(name) }

    println("-----------------")

    nomes.sort()

    nomes.forEach { name -> println(name) }

    println("-----------------")

    val names = arrayOf("Maria", "João", "José")

    names.forEach { name -> println(name) }

}