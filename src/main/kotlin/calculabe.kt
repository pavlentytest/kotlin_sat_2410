fun interface Calculabe {
    fun sum(a: Double, b: Double): Double
}
fun main() {
    val calculabe = Calculabe({ a, b -> a+b })
}