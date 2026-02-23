package oop_00000116912_devlinvalentino_week4

open class Car(brand: String, val numberOfDoor: Int) : vehicle(brand) {

    fun openTruck() {
        println("bagasi mobil $brand dengan $numberOfDoor pintu dibuka")
    }
}
