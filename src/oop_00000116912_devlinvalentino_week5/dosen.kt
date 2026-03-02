package oop_00000116912_devlinvalentino_week5

class Dosen(nama: String, val nidn: String): Pegawai(nama){

    override fun bekerja(){
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS")
    }

    fun mangajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}