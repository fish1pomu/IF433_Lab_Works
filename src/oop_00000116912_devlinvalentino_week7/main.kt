package oop_00000116912_devlinvalentino_week7

fun main(){
    println("test singleton")
    println("status: ${databaseManager.connectionStatus}")
    databaseManager.connect()

    println("test compenion objek")
    val client = networkClient.createClient()
    client.connect()

    println("test regular class")
    val data1= RegularUser("Alice", 22)
    val data2= RegularUser("Alice", 22)
    println(data1)
    println("sama ${data1 == data2}")
}