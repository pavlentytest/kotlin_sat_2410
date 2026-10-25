class Individual(var name: String, var age: Int) : Comparable<Individual>{
    override fun compareTo(other: Individual): Int {
        return name.compareTo(other.name)
    }
}
fun main() {
    val list = listOf(1, 2, 10, 93,11,24,-2)
    println(list.sorted())
    val individuals = listOf<Individual>(
        Individual("Ivan",20),
        Individual("Petr",22),
        Individual("Olga",23),
        Individual("Alex",18)
    )
    println(individuals.sorted())

}