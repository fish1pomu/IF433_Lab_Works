package oop_00000116912_devlinValentino_week1

fun main() {
    val name: String = "john thor"
    val score: Int = 80

    println("Name : $name ,Nilai $score")

    val grade = when (score){
        in 90  .. 100 -> "A"
        in 80  ..  89 -> "B"
        in 70  ..  79 -> "C"
        else -> "D"
    }
    print("grade kamu: $grade")
}


