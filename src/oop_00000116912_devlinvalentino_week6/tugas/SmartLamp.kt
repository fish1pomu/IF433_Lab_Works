package oop_00000116912_devlinvalentino_week6.tugas

class smartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name dinyalakan oleh $id.")
    }

    override fun turnOff() {
        println("$name dimatikan oleh $id.")
    }
}