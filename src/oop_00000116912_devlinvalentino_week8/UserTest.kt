package oop_00000116912_devlinvalentino_week8

object DatabaseMock {
    fun findUser(id: Int): Userprofile? {
        return if (id == 1) Userprofile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n==== RUNNING UNIT TEST ====")
    val testUser = DatabaseMock.findUser(1)

    val initial = testUser!!.name.substring(0, 1)

    check(initial == "T") { "Test Failed! Initial is wrong." }

    println("Test Passed: Initial is T")
}