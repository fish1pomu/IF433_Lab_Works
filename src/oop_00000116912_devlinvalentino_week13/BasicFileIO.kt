package oop_00000116912_devlinvalentino_week13

import java.io.File

fun main(){
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("line 1 : Inisialiasi sistem \n")
    println("file berhasil dibuat dan ditulis")
}