package oop_00000116912_devlinvalentino_week7.tugas

fun main() {

    println("Simulasi Game Engine ")

    val legendaryRarity = ItemRarity.LEGENDARY
    println("Drop chance untuk item LEGENDARY adalah: ${legendaryRarity.dropChance}%")


    val starterWeapon = Weapon.forgeStarterSword()

    println("Senjata Awal Berhasil Dibuat!")
    println("Detail Senjata: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage} | Durability: ${starterWeapon.durability}")
    println("Kelangkaan: ${starterWeapon.item.rarity.name}")
}