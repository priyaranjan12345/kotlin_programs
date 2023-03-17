class ListEg {}

data class Student(val studentName: String, val studentRollNo: Int)

fun main() {
    println("Hello, world!!!")

    val students: MutableList<Student> = mutableListOf()

    students.add(Student("Rama", 1))
    students.add(Student("Sita", 2))
    students.add(Student("Hari", 3))
    students.add(Student("Robby", 4))
    students.add(Student("Anthony", 5))
    students.add(Student("Paddy", 6))
    students.add(Student("Bob", 7))

    students.sortBy { it.studentName }

    for (student in students) {
        println("Name: ${student.studentName} and RollNo: ${student.studentRollNo}")
    }

}