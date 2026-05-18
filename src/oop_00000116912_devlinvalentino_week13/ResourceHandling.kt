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


    println("\n=== TEST SAFE RESOUCE HANDLING ===")
    val safeFile = File("safe_logs.txt")

    safeFile.printWriter().use { out ->
        for (i in 1..100){
            out.println("safe log entry #$i: system status ok.")
        }
    }
    println("100 baris log berhasil di generate dengan sangat aman.")


    println("\n=== TEST BUFFERD READER ===")
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach {line ->
            println("stream read: $line")
        }
    }
}