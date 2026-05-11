package oop_00000116912_devlinvalentino_week12

fun dispenseKibble(
requestedGram: Int,
availableGram: Int,
isJammed: Boolean
): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    if (isJammed) {
        throw FeederException.DispenserJamException()
    }

    return if (requestedGram <= availableGram) {
        availableGram - requestedGram
    } else {
        0
    }

}


