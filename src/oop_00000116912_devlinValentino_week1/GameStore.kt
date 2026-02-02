package oop_00000116912_devlinValentino_week1

fun main() {

    val gameTitle: String = "Astro Bot"
    val price: Int = 600000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price = price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("Judul Game  : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : ${userNote ?: "Tidak ada catatan"}")
}

