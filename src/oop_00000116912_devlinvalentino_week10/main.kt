package oop_00000116912_devlinvalentino_week10

fun main(){
    println("=== TEST GENERIC CLASS === ")
    val inBox = Box(100)
    val stringBox =  Box("Generic in kotlin")

    println("isi inbox: ${inBox.value}")
    println("isi stringbox ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("bitcoin", 65000)
    println("asset: ${itemPrice.key}, harga: ${itemPrice.value} USD")
}