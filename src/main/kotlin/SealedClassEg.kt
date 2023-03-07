fun main() {
    val circle = Shape.Circle(4.9)
    val square = Shape.Square(6)
    val rectangle = Shape.Rect(8, 7)

    val obj = SealedClassEg()

    obj.checkShape(circle)
    obj.checkShape(square)
    obj.checkShape(rectangle)
}

sealed class Shape {
    class Circle(val r: Double) : Shape()
    class Square(val a: Int) : Shape()
    class Rect(val l: Int, val b: Int) : Shape()
}

class SealedClassEg {
    fun checkShape(shape: Shape) {
        when (shape) {
            is Shape.Circle -> println("Area of circle: ${3.14 * shape.r * shape.r}")
            is Shape.Square -> println("Area of square: ${shape.a * shape.a}")
            is Shape.Rect -> println("Area of rectangle: ${shape.l * shape.b}")
        }
    }
}