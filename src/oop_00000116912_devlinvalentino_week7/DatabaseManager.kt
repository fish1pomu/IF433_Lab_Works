package oop_00000116912_devlinvalentino_week7

object databaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to server"
        println("database is ready")
    }
}