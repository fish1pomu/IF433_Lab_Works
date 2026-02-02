package oop_00000116912_devlinValentino_week1

fun main (args: Array<String>) {
    var radius: Double = 7.0
    var pi: Double = 3.14

    var area: Double = pi * radius * radius

    println("Radius: " + radius + ",area " + area)
    checkSize(area)
}

fun checkSize(area : Double) {
    if (area >100 ){
        println("this is big circle")
    }else {
        println("this is a small circle")
    }
}