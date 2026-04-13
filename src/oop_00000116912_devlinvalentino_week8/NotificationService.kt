package oop_00000116912_devlinvalentino_week8

class notificationservice{
    fun sendEmail(emailAddress: String){
        println("mengirim email ke $emailAddress")
    }

    fun proccessEmail(emailAddress: String){

        if (user.email != null){

            sendEmail(emailAddress = user.email)
        }else {
            println("user ${user.name} tidak memiliki email")
        }
    }
}