package oop_00000116912_devlinvalentino_week10

fun main(){
    val coinRepo = walletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.125))
    coinRepo.add(Coin("ETH", 1.5))
    coinRepo.add(Coin("USDT", 500.0))
}