package oop_00000116912_devlinvalentino_week5

abstract class paymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}