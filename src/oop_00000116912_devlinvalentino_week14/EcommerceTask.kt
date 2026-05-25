package oop_00000116912_devlinvalentino_week14
import java.io.File


interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, pricingType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

interface PricingStrategy {
    fun calculate(price: Double): Double
    fun getStrategyName(): String // Tambahan pembantu untuk mencatat tipe customer di CSV
}


class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
    override fun getStrategyName(): String = "REGULAR"
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
    override fun getStrategyName(): String = "VIP"
}


class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, pricingType: String) {
        file.printWriter().use { writer ->
            writer.println("$itemName,$finalPrice,$pricingType")
        }
    }
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}
=

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    // processOrder sekarang menerima objek PricingStrategy langsung
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {

        // Blok 'when' yang kaku sudah dihapus, kalkulasi didelegasikan ke strategy interface
        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        // Menyimpan data dengan nama tipe strategi yang aktif
        repo.saveOrder(itemName, finalPrice, pricingStrategy.getStrategyName())

        notifier.sendNotification(itemName)
    }
}