fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 3
    values[2] = 4
    values[3] = 7
    values[4] = 5

    for (valor in values) {
        println(valor)
    }

    println("---------------")

    values.forEach { valor ->
        println(valor)
    }

    println("---------------")

    for(index in values.indices){
        println(values[index])
    }

    println("---------------")

    values.sort()

    for (valor in values){
        println(valor)
    }
}