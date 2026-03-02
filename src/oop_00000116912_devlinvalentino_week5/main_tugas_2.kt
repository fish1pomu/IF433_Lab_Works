package oop_00000116912_devlinvalentino_week5

fun main() {

    val dompetku = eWallet("Devlin E-Wallet", 50000.0)
    val kartuku = creditCard("Devlin Platinum", 100000.0)


    val daftarPembayaran: List<paymentMethod> = listOf(dompetku, kartuku)


    for (metode in daftarPembayaran) {
        println("Akun: ${metode.accountName}")

        metode.processPayment(75000.0)

        println("-----------------------------------------")
    }
}