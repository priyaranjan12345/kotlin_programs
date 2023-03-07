fun main() {
    val obj = HighLevelFunction()

    obj.addTwoNum(2, 7, object : MyInterface {
        override fun execute(sum: Int) {
            println("Sum Result: $sum")
        }
    })
}

class HighLevelFunction {
    fun addTwoNum(a: Int, b: Int, action: MyInterface) {
        val sum = a + b
        action.execute(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}