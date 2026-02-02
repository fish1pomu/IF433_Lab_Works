package oop_00000116912_devlinValentino_week1

fun main (args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius:   $radius area  $area")
    checkSize(area)
}

fun checkSize(area : Double) {
    if (area >100 ){
        println("this is big circle")
    }else {
        println("this is a small circle")
    }
}