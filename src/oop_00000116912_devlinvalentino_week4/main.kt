package oop_00000116912_devlinvalentino_week4

    fun main() {
        println("--- Testing Vehicle ---")
        val generalVehicle = vehicle(brand = "Sepeda Onthel")
        generalVehicle.honk()
        generalVehicle.accelerate()
        println("\n--- Testing Car ---")
        val myCar = Car(brand = "Toyota", numberOfDoor = 4)
        myCar.openTruck()
        myCar.honk()
        myCar.accelerate()

        println("\n--- Testing Electric Car ---")
        val myEV = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 100)
        myEV.openTruck()
        myEV.honk()
        myEV.accelerate()

        val managerKita = Manager("rine", 7000000)
        val devKita = developer("yulianto", 6000000, "Kotlin")

        println("\n--- Data Karyawan ---")
        managerKita.work()
        println("Bonus: ${managerKita.calculateBonus()}")

        devKita.work()
        println("Bonus: ${devKita.calculateBonus()}")


    }

