package me.murilo

fun main() {
    val murilo:Pair<String, Double> = Pair("Murilo", 10000.0)

    val map = mapOf(murilo)

    map.forEach {
        key, value -> println("""
            Nome do funcionário: $key
            Salário:             R$ $value
        """.trimIndent())
    }

    println("--------------------------------")

    val map2 = mapOf(
        "Pedro" to 3000.0,
        "Mariana" to 2800.0
    )

    map2.forEach { k,v -> println("""
        Nome:    $k
        salario: R$$v
    """.trimIndent()) }
}