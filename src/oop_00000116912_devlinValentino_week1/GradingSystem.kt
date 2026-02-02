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
    println("grade kamu: $grade")

    println ("status : ${calculateStatus(score)}")

    val studentId: String? = null

    val idLength = studentId?.length ?: 0
    println("panjang id: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "tidak lulus"



