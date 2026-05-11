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

fun main(){
    println("===TEST TRY AS EXPRESSION ====")
    val inputString = "123A"

    val result: Int = try {
        Integer.parseInt(inputString)
    }catch (e: NumberFormatException){
        -1
    }
    println("Hasil parsing: $result")
}