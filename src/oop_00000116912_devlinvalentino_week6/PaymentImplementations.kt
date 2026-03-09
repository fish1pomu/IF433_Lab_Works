package oop_00000116912_devlinvalentino_week6

class Gopay : paymentmethod{
    override fun pay(amout: Double) {println("prosesing rp $amout vai gopay server")}
}

class CreditCard : paymentmethod{
    override fun pay(amout: Double) {println("connecting bank from $amout")}
}

