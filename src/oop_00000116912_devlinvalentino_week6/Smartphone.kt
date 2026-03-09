package oop_00000116912_devlinvalentino_week6

class smarphone : Camera, Phone{

    override fun turnOn(){
        super <Camera>.turnOn()
        super <Phone>.turnOn()
        println("sistem operasi smartphone berhasil boooting")
    }
}