package oop_00000116912_devlinvalentino_week8

fun main(){
    println("==== TEST SAFE CALLS & ELVIS ====")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetail?.address?.city?.name ?:" kota tidak di ketahui"
    println(destination)

    println("\n==== TEST LET BLOCK ===")
    val validOrder = Order(null,250000)

    val receipt = validOrder.totalprice?.let{price ->
        val tax = price * 0.11
        "transaksi valid. harga rp $price, pajak: rp $tax"
    }?: "transaksi invalid: harga belu  di set!"
    println(receipt)

    println("\n==== TEST SAFE CASTING ===")
    val mixedDate: list<any> = listOf(
        "smartphone",
        150000,
        userprofile("Andi", null),
        "laptop",
        4500000.0
    )

}