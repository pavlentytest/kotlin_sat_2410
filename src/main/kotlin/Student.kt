class Student<T>(val id: T, val name: String)
fun main() {
    val student = Student(1, "John")
    val student2 = Student(2, "Ivan")
    val student3 = Student("J3dddd", "John")

}