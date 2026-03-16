package oop_00000116912_devlinvalentino_week7

enum class Appstate{
        STARTING,RUNNING, STOPPED
}

sealed class ApiResponse{
    data class Success(val data: String): ApiResponse()
    data class error(val massage: String): ApiResponse()
    object Loading: ApiResponse()
}