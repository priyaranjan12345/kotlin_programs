fun main() {
    val obj = ExceptionEg()
    try {
        val str = obj.validateAge(10)
        println("msg: $str")
    } catch (e: InvalidAgeException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println(e.message)
    }
}

class ExceptionEg {
    fun validateAge(age: Int): String {
        if (age < 18) {
            throw InvalidAgeException(message = "Not eligible for vote")
        } else {
            return "Eligible for vote"
        }
    }
}

class InvalidAgeException(message: String) : Exception(message) {}