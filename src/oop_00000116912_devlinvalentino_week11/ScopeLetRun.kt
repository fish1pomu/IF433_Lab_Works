package oop_00000116912_devlinvalentino_week11

fun main(){
    println("=== TEST RUN FUNCITON ====")
    val name: String? = "Alexander"

    val length = name?.let{
        println("nama terdeteksi: $it")
        it.length
    }
    println("panjang nama: $length")
}