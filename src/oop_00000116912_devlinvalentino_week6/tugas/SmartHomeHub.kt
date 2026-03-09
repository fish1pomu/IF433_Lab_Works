package oop_00000116912_devlinvalentino_week6.tugas

class smartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} berhasil ditambahkan ke Hub.")
    }


    fun turnOffAllSwitches() {
        println("\n--- Mematikan semua perangkat ---")
        for (device in devices) {

            if (device is Switchable) {
                device.turnOff()
            } else {
                println("${device.name} tidak memiliki saklar mati/nyala.")
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- Mengaktifkan Mode Keamanan ---")
        for (devices in devices) {
            if (devices is Recordable) {
                devices.startRecord()
            }

            if (devices is smartSpeaker) {
                devices.playMusic("Sirine Peringatan")
            }
        }
    }
}