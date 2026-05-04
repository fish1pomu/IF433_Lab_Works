package oop_00000116912_devlinvalentino_week11

fun main(){
    println("=== TEST EXTENSION FUNCTION ===")
    println("Alex". addGreeting())
    println("HI".repeatTimes(5))

    val text: String?= null
    println("apakah null/empty? ${text.isNullOrEmptyCustom()}")
}