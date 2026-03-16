package oop_00000116912_devlinvalentino_week7

fun main(){
    println("test singleton")
    println("status: ${databaseManager.connectionStatus}")
    databaseManager.connect()

    println("test compenion objek")
    val client = networkClient.createClient()
    client.connect()
}