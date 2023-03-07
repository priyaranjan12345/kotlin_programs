class ScopeEg {
}

class Person {
    var name: String = ""
    var age: Int = 0

    fun printMsg() {
        println("Name: $name\nAge: $age")
    }
}

fun main() {
    val str: String = "Hello World"
    val person = Person()

    /// with
    with(person) {
        name = "Rama"
        age = 24
    }
    person.printMsg()

    /// apply
    person.apply {
        name = "Sita"
        age = 20
    }.printMsg()

    /// run
    str.run {
        println("Length is : $length")
    }

    str.apply {
        println("length: $length")
    }

    str.let {
        println("length: ${it.length}")
    }

    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("The list elements before adding new element: $it") }
        .add("four")

    println(numbers)
}