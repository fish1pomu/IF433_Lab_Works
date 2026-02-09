package oop_00000116912_devlinvalentino_week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukan judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukan nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukan lama peminjaman: ")
    var duration = scanner.nextInt()


    if (duration < 0) {
        duration = 1
    }

    val currentLoan = Loan(bookTitle, borrower, duration)

    // Output results
    println("\n--- Detail Pinjaman ---")
    println("Judul Buku  : ${currentLoan.bookTitle}")
    println("Peminjam    : ${currentLoan.borrower}")
    println("Lama Pinjam : ${currentLoan.loanDuration} hari")
    println("Total Denda : Rp ${currentLoan.calculateFine()}")
}