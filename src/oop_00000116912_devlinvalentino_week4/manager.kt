package oop_00000116912_devlinvalentino_week4

class Manager(name: String, baseSalary: Int) : employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat tim.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}