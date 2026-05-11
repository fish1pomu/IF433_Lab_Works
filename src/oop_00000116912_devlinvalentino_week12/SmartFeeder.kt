package oop_00000116912_devlinvalentino_week12

fun dispenseKibble(
requestedGram: Int,
availableGram: Int,
isJammed: Boolean
): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    if (isJammed) {
        throw FeederException.DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FeederException.FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram

}

fun main() {
    var currentKibbleStock = 50

    println("--- Jadwal Makan 1: Pagi ---")

    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        println("Sisa stok sekarang: $currentKibbleStock gr")

    } catch (e: FeederException.DispenserJamException) {
        println("Error: ${e.message}")

    } catch (e: FeederException.FoodEmptyException) {
        println("Error: ${e.message}")

    } catch (e: Exception) {
        println("Terjadi kesalahan sistem: ${e.message}")

    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n--- Jadwal Makan 2: Sore ---")

    currentKibbleStock = 1000

    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->

        println("Peringatan ke Pemilik: ${error.message}")
    }
}



