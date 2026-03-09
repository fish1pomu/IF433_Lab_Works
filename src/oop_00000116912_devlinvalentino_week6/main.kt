package oop_00000116912_devlinvalentino_week6

fun processCheckout(method: paymentmethod, amout: Double){
    println("_>manual checkout")
    method.pay(amout)
}

fun main() {
    val myWatch = smartwatch()
    myWatch.showTime()

    val myPhone = smarphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amout = 50000.0)
    processCheckout(method = pay2, amout = 150000.0)
}