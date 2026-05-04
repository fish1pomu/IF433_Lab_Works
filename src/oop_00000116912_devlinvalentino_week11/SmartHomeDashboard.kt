package oop_00000116912_devlinvalentino_week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(name = "", category = "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("Berhasil menambahkan: ${it.name}")

        SmartDevice("Ezviz Outdoor", "Camera").apply {
            isOnline = true
            powerLoad = 5
        }.also {
            println("(LOG) Kamera terhubung")
            homeDevices.add(it)
        }
        val acInverter = run {
            val deviceName = "Daikin Inverter (Kabel 3x2.5)"
            val category = "HVAC"
            SmartDevice(deviceName, category, false, 800)
        }
        homeDevices.add(acInverter)

        homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    }

    println("\n=== PENCARIAN PERANGKAT ===")

    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let {
        val statusDiagnosa = it.diagnose()
        println("Hasil Pencarian: $statusDiagnosa")
    } ?: println("Pencarian Gagal: Perangkat dengan kategori Camera tidak ditemukan.")

    with(homeDevices) {
        println("\n=== RINGKASAN SISTEM ===")
        println("Total perangkat yang terdaftar: ${this.size}")
        println("Status Dashboard: Aktif")
    }
}