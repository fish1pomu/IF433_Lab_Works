package oop_00000116912_devlinvalentino_week6

class smartwatch : watch(), BluetoothConnecttable, Rechargeable{
    override fun showTime(){
        println("layar oled menyala: 14:00 wib")
    }

    override fun connectTobluetooth(){
        println("mencari perangkat hp di sekitar untuk pairing")
    }

    override fun chargeBattery(){
        println("mengisi daya untuk menggunakan charger magnegtic 15 w")
    }

}