package oop_00000116912_devlinvalentino_week13

import java.io.File

fun main(){
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("line 1 : Inisialiasi sistem \n")
    println("file berhasil dibuat dan ditulis")
    file.appendText("line 2: menambahkan konfigurasi baru.\n")
    println("text berhasil dibuat append")


    println("\n=== TEST READ TEXT ===" )
    val fullContent = file.readText()
    println("membaca sekaligus: \n $fullContent")

    println("=== TEST READ TEXT ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("isi index $index: $line")
    }
}