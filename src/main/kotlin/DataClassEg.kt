class DataClassEg {
    private var name: String = ""
    private var age: Int = 0
    fun copy(name: String = this.name, age: Int = this.age) = User(name, age)
}

data class User(val name: String, val age: Int)

fun main() {
    val user1 = User(name = "Rama", age = 20)
    val user2 = User(name = "Sita", age = 18)
    val user3 = User(name = "Hari", age = 20)

    println("Name: ${user1.name} and Age: ${user1.age}")

    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
    println("Name: ${olderJack.name} and Age: ${olderJack.age}")

    val jane = User("Jane", 35)
    val (name, age) = jane
    println("$name, $age years of age") // prints "Jane, 35 years of age"
}