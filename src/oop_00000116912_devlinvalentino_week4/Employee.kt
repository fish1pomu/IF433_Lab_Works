package oop_00000116912_devlinvalentino_week4

open class employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (0.1 * baseSalary).toInt()
    }
}