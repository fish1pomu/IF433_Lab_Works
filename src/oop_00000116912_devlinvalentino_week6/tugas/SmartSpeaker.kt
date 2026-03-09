package oop_00000116912_devlinvalentino_week6.tugas

class smartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name (Speaker) menyala.")
    }

    override fun turnOff() {
        println("$name (Speaker) mati.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}