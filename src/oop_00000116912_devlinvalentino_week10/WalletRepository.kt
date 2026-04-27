package oop_00000116912_devlinvalentino_week10

class walletRepository<T>{
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }
    fun getAll(): List<T> {
        return items
    }
}