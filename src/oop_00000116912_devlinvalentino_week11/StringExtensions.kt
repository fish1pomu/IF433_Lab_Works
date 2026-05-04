package oop_00000116912_devlinvalentino_week11

fun String.addGreeting(): String {
    return "hallo, $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}