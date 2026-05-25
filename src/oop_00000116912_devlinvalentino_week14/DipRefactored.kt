package oop_00000116912_devlinvalentino_week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String): List<String> = listOf("pg_data1", "pg_data2")
}