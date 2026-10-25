fun main() {


}
open class Animal {
    open fun makeSound() {
        println("Animal make sound")
    }
}
class Cat : Animal() {
    fun makeSound(str: String) {
        println("Animal make sound: $str")
    }
    override fun makeSound() {
        println("Mau!")
    }
}