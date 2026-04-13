package oop_00000116912_devlinvalentino_week8

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {

        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }

            else -> null
        }
    }

    fun checkout(product: Product) {

        val id: String
        val description: String

        when (product) {
            is Product.Electronic -> {
                id = product.id
                description = "${product.name} (Warranty ${product.warrantyMonths})"
            }
            is Product.Clothing -> {
                id = product.id
                description = "${product.name} (Size ${product.size})"
            }
        }

        val transactionId = JavaPaymentService.processPayment(id)!!

        println("$description -> $transactionId")
    }
}