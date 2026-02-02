package oop_00000116912_devlinValentino_week1

fun main () {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius:   $radius area  $area")
    println (checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) {
    "this is a big circle"
} else {
    "this is a small circle"
}
