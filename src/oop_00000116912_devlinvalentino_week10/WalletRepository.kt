package oop_00000116912_devlinvalentino_week10

class walletRepository<T>{
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }
    fun getAll(): List<T> {
        return items
    }

    fun <S> findByName(query: String): S?
            where S : T, S : Searchable {
        return items
            .filterIsInstance<Searchable>()
            .find { it.name.equals(query, ignoreCase = true) } as? S
    }
}