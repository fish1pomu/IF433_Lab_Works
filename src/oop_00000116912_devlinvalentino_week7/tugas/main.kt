package oop_00000116912_devlinvalentino_week7.tugas

fun main() {

    println("Simulasi Game Engine ")

        gameManager.startGame()
        gameManager.startGame()

        val starterWeapon = Weapon.forgeStarterSword()

        println("\nSenjata Awal: ${starterWeapon.item.name}")
        println("Damage: ${starterWeapon.item.damage} | Durability: ${starterWeapon.durability}")


        val upgradedItem = starterWeapon.item.copy(damage = 25)
        println("\nBerhasil upgrade ${upgradedItem.name}! Damage sekarang: ${upgradedItem.damage}")


        println("\n--- Memulai Battle Log ---")
        processEvent(BattleState.SafeZone)
        processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
        processEvent(BattleState.LootDropped(upgradedItem))
        processEvent(BattleState.GameOver("Terkena jebakan racun"))
    }
