package oop_00000116912_devlinvalentino_week3

class Employee(val name: String ){
    var salary: Int = 0
        set(value){
            if (value < 0){
                println("eror: gaji tidak boleh negative! di set ke 0.")
                field =0
            }else {
                field =value
            }

        }
}

