package oop_00000116912_devlinvalentino_week7

class networkClient private constructor(val url: String){
    fun connect() {
        println("Connecting to $url")
    }
}