package oop_00000116912_devlinvalentino_week5

fun main() {
    val math = mathHelper()
    println("Hasil Luas Persegi (sisi 6): ${math.hitungLuas(6)}")
    println("Hasil Luas Persegi Panjang (7x6): ${math.hitungLuas(7, 6)}")
    println("Hasil Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")
    println()

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------")
    }
}