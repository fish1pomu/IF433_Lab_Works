package oop_00000116912_devlinvalentino_week12

class InsufficientfundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount balance of $balance")