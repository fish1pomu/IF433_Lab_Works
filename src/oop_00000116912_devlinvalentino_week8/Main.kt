package oop_00000116912_devlinvalentino_week8

fun main(){
    println("==== TEST SAFE CALLS & ELVIS ====")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetail?.address?.city?.name ?:" kota tidak di ketahui"
    println(destination)
}