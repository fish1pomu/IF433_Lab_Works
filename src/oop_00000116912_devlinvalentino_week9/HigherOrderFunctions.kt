package oop_00000116912_devlinvalentino_week9

fun main (){
    val numbers = listOf(1, 2, 3, 4, 5,6, 7, 8)
    println("original data: $numbers")
    println("=== HOF: FILTER ===")

    val evens = numbers.filter { it % 2 == 0 }
    println("evens only: $evens")
}