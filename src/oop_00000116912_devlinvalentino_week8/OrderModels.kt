package oop_00000116912_devlinvalentino_week8

class City(val name: String)
class Address(val city: City?)
class DeliveryDetail(val address: Address? )
class Order (val deliveryDetail: DeliveryDetail?, val totalprice: Int?)