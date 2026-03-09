package oop_00000116912_devlinvalentino_week6.tugas


class smartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable{

    override fun turnOn() {
        println("$name dinyalakan oleh $id.")
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println("$name dimatikan oleh $id.")
    }

    override fun startRecord() {
        println("$name mulai merekam video ke penyimpanan lokal")
    }
}