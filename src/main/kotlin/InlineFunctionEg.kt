class InlineFunctionEg {
}

inline fun inlineFuc(fn: () -> Unit) {
    fn() // void callback
    println("Inside inline function")
}

fun main() {
    inlineFuc { println("Hello") }
}