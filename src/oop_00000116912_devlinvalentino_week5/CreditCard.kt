package oop_00000116912_devlinvalentino_week5

class creditCard(accountName: String, val limit: Double) : paymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - Credit Card] Transaksi sukses senilai $amount. Sisa limit: ${limit - usedAmount}")
        } else {
            println("[$accountName - Credit Card] Transaksi ditolak! Melebihi batas limit.")
        }
    }
}