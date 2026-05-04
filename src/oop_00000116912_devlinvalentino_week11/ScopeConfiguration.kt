package oop_00000116912_devlinvalentino_week11

data class User(var name: String = "", var age: Int = 0)

fun main(){
    println("=== TEST APPLY ===")
    val user = User().apply{
        name = "Alex"
        age = 25
    }
    println(user)

    println("\n=== Test also ===")
    val number = mutableListOf(1, 2, 3,)
    number.also{
        println("log sebelum ditambah : $it")
    }.add(4)
    println("setelah di tambah: $number")

    println("\n=== Test with ===")
    with(user){
        println("user detail -> $name, umur: $age")
    }

}

