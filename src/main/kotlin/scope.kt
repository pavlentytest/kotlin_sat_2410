// scope functions
// apply(), let(), also(), run(), with()
class Dog {
    var name: String = ""
    var age: Int = 5
    var color: String = "white"
}
fun main() {
    val dog = Dog().apply {
        name = "Bobik"
        age = 25
        color = "red"
    }
    val x: Int? = 0
    x?.run { } ?: "Good!"
    x?.also{ }.also { println(it) }

    printMessage(genMessage(checkCode(200)))

    200.run(::checkCode)
        .run(::genMessage)
        .run(::printMessage)

    with("dfgadfg adfg adfga dfg"){
        if(this.startsWith("D")) {

        } else {

        }
    }

}
fun checkCode(code: Int) = code == 200
fun genMessage(flag: Boolean) = if (flag) "Yes" else "No"
fun printMessage(message: String) = println(message)