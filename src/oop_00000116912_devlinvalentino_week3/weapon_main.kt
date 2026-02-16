package oop_00000116912_devlinvalentino_week3

fun main() {
    val myWeapon = Weapon("staff of homa")

    myWeapon.damage = -50

    myWeapon.damage = 9999
    println("damage saat ini: ${myWeapon.damage}")
    println("Tier: ${myWeapon.tier}")
}