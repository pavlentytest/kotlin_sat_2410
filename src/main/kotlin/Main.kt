import java.util.Locale
import java.util.Locale.getDefault

class Test2 : Test() {
    internal fun ddd() {
        val x: Int = prop2
    }
}
open class Test {
    protected val prop2: Int = 1000
    var prop: String = "test"
        get() = field.uppercase(getDefault())
        private set(value) { field = value }
    private fun doSmth() {
        println(this.prop)
    }
}
fun main() {
    val test = Test()

    println(test.prop) // getter
}