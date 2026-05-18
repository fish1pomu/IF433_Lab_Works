package oop_00000116912_devlinvalentino_week13
import java.io.File
import java.io.FileNotFoundException
fun main() {
    val students = listOf(
        Student(name = "Alice", age = 20, gpa = 3.8),
        Student(name = "Bob", age = 22, gpa = 3.5)
    )

    saveStudents(students, path = "students.csv")

    val loaded = loadStudents(path = "students.csv")
    println("=== LOADED STUDENT DATA ===")
    loaded.forEach { println(it) }
}