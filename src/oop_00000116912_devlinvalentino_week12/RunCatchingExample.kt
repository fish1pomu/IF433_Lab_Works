package oop_00000116912_devlinvalentino_week12

fun main(){
    println("=== TEST FUNCATCHING ===")
    val result: Result<Int> = runCatching{
        "42x".toInt()
    }

    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    runCatching{
        "100".toInt()
    }.onSuccess{v ->
        println("berhasil di konversi: $v")
    }.onFailure{e ->
        println("gagal konversi: ${e.message}")
    }
}

