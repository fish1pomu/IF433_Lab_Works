package oop_00000116912_devlinvalentino_week12

fun main(){
    println("=== TEST FUNCATCHING ===")
    val result: Result<Int> = runCatching{
        "42x".toInt()
    }
}