package oop_00000116912_devlinvalentino_week6

class button (override val name: String) : clickable {
    override fun click(){
        println("tombol '$name' berhasil di clik)
    }
}