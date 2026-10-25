

interface Calculate {
    fun calculate(x: Double): Double
    fun rr() {
        println("asd")
    }
}
interface Switch : Calculate {

    fun switchOn()
    fun switchOff()
    override fun calculate(x: Double): Double {
        TODO("Not yet implemented")
    }

}

fun main() {
    val switch = object: Switch {
        override fun switchOn() {}
        override fun switchOff() {}
    }
}