package oop_00000116912_devlinvalentino_week9


fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),   // Profit, Closed
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),  // Loss, Closed
        TradeLog("BTCUSDT", "SHORT", 50, 45.0, "OPEN"),    // Profit, Open
        TradeLog("SOLUSDT", "LONG", 10, -12.0, "OPEN"),    // Loss, Open
        TradeLog("ETHUSDT", "LONG", 25, 8.3, "CLOSED"),    // Profit, Closed
        TradeLog("BTCUSDT", "LONG", 100, -25.0, "CLOSED")  // Big Loss, Closed
    )

    println("=== TRADING DASHBOARD INITIALIZED ===")
    println("Total Transaksi: ${tradeHistory.size}")


    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    println("=== CLOSED TRADES ONLY ===")
    closedTrades.forEach {
        println("Pair: ${it.pair} | ROE: ${it.roe}% | Status: ${it.status}")
    }

    val winningTrades = closedTrades.filter { it.roe > 0 }
    println("\n=== WINNING TRADES (PROFIT ONLY) ===")
    winningTrades.forEach {
        println("Profit: ${it.pair} | ROE: +${it.roe}%")
    }

    val losingTrades = closedTrades.filter { it.roe <= 0 }
    println("\n=== LOSING TRADES (LOSS/BREAK EVEN) ===")
    losingTrades.forEach {
        println("Loss: ${it.pair} | ROE: ${it.roe}%")
    }
}