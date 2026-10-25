abstract class Transport {
    abstract fun makeSound()
    fun tt() {

    }
}
class Bus : Transport() {
    override fun makeSound() {
        TODO("Not yet implemented")
    }
}
fun main() {
    val bus = Bus()
    bus.makeSound()
    val transport = object : Transport () {
        override fun makeSound() {
            TODO("Not yet implemented")
        }
    }
    transport.makeSound()
}