package oop_00000116912_devlinvalentino_week11

fun main(){
    println("=== TEST EXTENSION FUNCTION ===")
    println("Alex". addGreeting())
    println("HI".repeatTimes(5))

    val text: String?= null
    println("apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "kotlin".run{
        println("memproses kata: ${this}")
        length * 2
    }
    println("hasil kalkulasi run: $result")
}