package oop_00000116912_devlinvalentino_week3

fun main() {
    val e = Employee("budi")

    e.salary = -1000
    e.salary = 5000000
    println("gaji: ${e.salary}")

    e.increasePerformance()

    println("pajak yang harus di bayar: ${e.tax}")
    e.salary = 5000
}