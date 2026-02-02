package oop_00000116912_devlinValentino_week1

fun main() {

    val gameTitle: String = "Astro Bot"
    val price: Int = 600000

}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }
