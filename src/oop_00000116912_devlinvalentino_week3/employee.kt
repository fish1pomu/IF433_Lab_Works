package oop_00000116912_devlinvalentino_week3

class Employee(val name: String ){
    var salary: Int = 0
        set(value){
            println("mencoba set gaji ke: $value")
        this.salary = value
        }
}

