package oop_00000116912_devlinvalentino_week7

class networkClient private constructor(val url: String){

    companion object {
        const val BASE_URL = "http://api.umn.ac.id"

        fun createClient(): networkClient {
            println("memhubungkan networkclient denga BASE_URL: $BASE_URL")
            return networkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url")
    }
}