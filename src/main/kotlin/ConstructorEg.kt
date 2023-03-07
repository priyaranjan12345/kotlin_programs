fun main() {
    val obj = ConstructorEg("Priyaranjan")
    obj.printName()
}

class ConstructorEg constructor(private var name: String) {
    fun printName() {
        println("Name: $name")
    }
}