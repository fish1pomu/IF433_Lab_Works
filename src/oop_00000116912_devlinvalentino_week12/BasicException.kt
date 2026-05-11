package oop_00000116912_devlinvalentino_week12

fun divede(a: Int, b: Int): Int {
    try{
        return a / b
    }catch (e: ArithmeticException){
        println("Error: ${e.message}")
        return -1
    }finally{
        println("devision attempt finished")
    }
}