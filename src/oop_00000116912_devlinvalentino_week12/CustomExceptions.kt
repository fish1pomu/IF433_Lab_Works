package oop_00000116912_devlinvalentino_week12

class InsufficientfundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount balance of $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw IllegalArgumentException("Amount must be positive")
        }
        if (amount > balance) {
            throw InsufficientfundsException(amount, balance)
        }

        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}