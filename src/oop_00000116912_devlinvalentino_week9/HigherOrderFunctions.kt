package oop_00000116912_devlinvalentino_week9

fun main (){
    val numbers = listOf(1, 2, 3, 4, 5,6, 7, 8)
    println("original data: $numbers")
    println("=== HOF: FILTER ===")

    val evens = numbers.filter { it % 2 == 0 }
    println("evens only: $evens")

    println("\n=== HOF: MAP ===")
    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")


}