package oop_00000116912_devlinvalentino_week13

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double)


fun TradeRecord.toCsv(): String = "${id},${symbol},${type},${margin},${pnl}"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")

    return TradeRecord(
        id = parts[0].toIntOrNull() ?: return null,
        symbol = parts[1],
        type = parts[2],
        margin = parts[3].toDoubleOrNull() ?: return null,
        pnl = parts[4].toDoubleOrNull() ?: return null
    )
}