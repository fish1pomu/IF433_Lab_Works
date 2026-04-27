package oop_00000116912_devlinvalentino_week10

interface Searchable {
    val name: String
}


class walletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(query: String): T? {
        return items.find { item ->
            val searchableItem = item as? Searchable
            searchableItem?.name.equals(query, ignoreCase = true)
        }
    }
}