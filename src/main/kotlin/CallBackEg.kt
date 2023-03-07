class CallBackEg {
    fun performWork(name: String, myCallback: (result: String) -> String): String {
        return myCallback("Given name is: $name")
    }
}

fun main() {
    val obj = CallBackEg()
    var myCallback: (String) -> String = { s: String -> s }
    val result = obj.performWork("Rama") { result: String -> "message: $result" }
    println(result)
}