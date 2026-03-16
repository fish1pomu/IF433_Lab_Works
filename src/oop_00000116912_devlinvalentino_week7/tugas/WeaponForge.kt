package oop_00000116912_devlinvalentino_week7.tugas


class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object { // Pastikan TIDAK ada underscore (_) di sini
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Woden Stick", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Triden", 150, ItemRarity.EPIC)
            return Weapon(epicItem, 200)
        }
    }
}