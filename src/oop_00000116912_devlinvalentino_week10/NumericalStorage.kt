package oop_00000116912_devlinvalentino_week10

class MathBox<T : Number>(val value1: T, val value2: T){
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}

fun <T> getMaxx (a: T, b: T): T where T : Number, T : Comparable<T> {
    return if(a > b) a else b
}