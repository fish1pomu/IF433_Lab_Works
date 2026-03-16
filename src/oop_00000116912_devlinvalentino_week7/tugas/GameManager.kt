package oop_00000116912_devlinvalentino_week7.tugas

object gameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")

        }
        else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}