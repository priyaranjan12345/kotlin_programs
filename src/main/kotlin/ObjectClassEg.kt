fun main() {
    val obj1 = MySingleton
    obj1.name = "Rama"
    println("Name: ${obj1.name}")

    val obj2 = MySingleton
    println("Name: ${obj2.name}")

    println("Name: ${MySingleton.name}")
}

class ObjectClassEg {

}

object MySingleton {
    var name: String = "Sita"
    var age: Int = 20

    init {
        println("MySingleton is initialized")
    }
}
