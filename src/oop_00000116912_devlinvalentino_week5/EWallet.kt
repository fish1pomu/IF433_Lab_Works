package oop_00000116912_devlinvalentino_week5

class eWallet(accountName: String, var balance: Double) : paymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil! Saldo $accountName berkurang sebesar $amount. Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup untuk melakukan pembayaran sebesar $amount")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Berhasil top up! Saldo $accountName sekarang: $balance")
    }
}