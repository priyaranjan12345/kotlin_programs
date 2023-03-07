fun main() {
    val obj = EnumEg()

    val str = obj.getCreditCard(CreditCard.GOLD)
    println(str)

    val color = obj.getCreditCardColor(CreditCardColor.DIAMOND)
    println(color)

    val limit = obj.getCreditCardLimit(CreditCardLimit.DIAMOND)
    println(limit)
}


enum class CreditCard {
    SILVER,
    GOLD,
    DIAMOND,
}

enum class CreditCardColor(val color:String) {
    SILVER("Grey"),
    GOLD("Yellow"),
    DIAMOND("White"),
}

interface ICreditCardLimit {
    fun getCreditCardLimit():Double
}

enum class CreditCardLimit:ICreditCardLimit {
    SILVER {
        override fun getCreditCardLimit(): Double {
            return 10000.00
        }
    },
    GOLD {
        override fun getCreditCardLimit(): Double {
            return 20000.00
        }
    },
    DIAMOND {
        override fun getCreditCardLimit(): Double {
            return 30000.00
        }
    },
}

class EnumEg {
    fun getCreditCard(card: CreditCard):String {
        return when(card) {
            CreditCard.SILVER -> "Silver Credit ${CreditCard.SILVER.name} and ordinal is ${CreditCard.SILVER.ordinal}"
            CreditCard.GOLD -> "Gold Credit Card ${CreditCard.GOLD.name} and ordinal is ${CreditCard.GOLD.ordinal}"
            CreditCard.DIAMOND -> "Diamond Credit Card ${CreditCard.DIAMOND.name} and ordinal is ${CreditCard.DIAMOND.ordinal}"
        }
    }

    fun getCreditCardColor(card: CreditCardColor):String {
        return when(card) {
            CreditCardColor.SILVER -> "Credit Card Color: ${CreditCardColor.SILVER.color}"
            CreditCardColor.GOLD -> "Credit Card Color: ${CreditCardColor.GOLD.color}"
            CreditCardColor.DIAMOND -> "Credit Card Color: ${CreditCardColor.DIAMOND.color}"
        }
    }

    fun getCreditCardLimit(card: CreditCardLimit):String {
        return when(card) {
            CreditCardLimit.SILVER -> "Credit Card Limit: ${CreditCardLimit.SILVER.getCreditCardLimit()}"
            CreditCardLimit.GOLD -> "Credit Card Limit: ${CreditCardLimit.GOLD.getCreditCardLimit()}"
            CreditCardLimit.DIAMOND -> "Credit Card Limit: ${CreditCardLimit.DIAMOND.getCreditCardLimit()}"
        }
    }
}