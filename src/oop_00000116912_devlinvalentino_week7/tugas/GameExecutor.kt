package oop_00000116912_devlinvalentino_week7.tugas

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("AWAS! Muncul monster ${event.monsterName}. Siapkan senjatamu!")
        }

        is BattleState.LootDropped -> {
            val (name, _, rarity) = event.item
            println("HOKI! Kamu dapat loot: $name [Rarity: ${rarity.name}, Drop Chance: ${rarity.dropChance}%]")
        }

        is BattleState.GameOver -> {
            println("GAME OVER: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Kamu memasuki Zona Aman. Silakan beristirahat sejenak.")
        }
    }
}