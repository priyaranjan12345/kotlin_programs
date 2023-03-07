class CompanionEg {
    companion object {
        var name: String = "Rama"
        var age: Int = 30
    }
}

fun printName() {
    println(CompanionEg.name)
}

fun main() {
    println(CompanionEg.name)

    CompanionEg.name = "Sita"
    println(CompanionEg.name)

    printName()
}