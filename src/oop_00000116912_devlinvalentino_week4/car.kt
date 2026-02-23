package oop_00000116912_devlinvalentino_week4

open class Car(brand: String, val numberOfDoor: Int) : vehicle(brand) {

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }

    fun openTruck() {
        println("bagasi mobil $brand dengan $numberOfDoor pintu dibuka")
    }
}