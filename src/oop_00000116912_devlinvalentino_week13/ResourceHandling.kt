package oop_00000116912_devlinvalentino_week13

import java.io.File

fun main(){
    println("=== TEST UNSAFE RESOUCE HANDELING")

    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("log 1: membuka koneksi database")
    writer.println("log 2: menulis data pengguna")

    writer.close()
    println("proses penulisan unsafe selesai")
}