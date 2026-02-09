package oop_00000116912_devlinvalentino_week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukan Nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukan Base Damage: ")
    val heroDamage = scanner.nextInt()

    val myHero = Hero(heroName, heroDamage)


    var enemyHp = 100

    while (myHero.isAlive() && enemyHp > 0) {
        println("\nHP Anda: ${myHero.hp} | HP Musuh: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilih aksi: ")

        when (scanner.nextInt()) {
            1 -> {

                myHero.attack("Musuh")
                enemyHp -= myHero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("Sisa HP musuh: $enemyHp")


                if (enemyHp > 0) {
                    val damageReceived = (10..20).random()
                    myHero.takeDamage(damageReceived)
                    println("Musuh menyerang balik! Anda terkena $damageReceived damage.")
                    println("Sisa HP Anda: ${myHero.hp}")
                }
            }
            2 -> {

                println("Anda memilih untuk kabur dari pertarungan!")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }


    println("\n--- PERTANDINGAN BERAKHIR ---")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} menang!")
    } else if (!myHero.isAlive()) {
        println("Sayang sekali, ${myHero.name} telah gugur...")
    } else {
        println("Pertarungan berakhir karena Anda kabur.")
    }
}