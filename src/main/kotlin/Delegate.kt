fun main() {
    val mother = Mother(Son(),Daughter())
    mother.doCook()
    mother.doClean()
    mother.setTable()
}

class Mother(s: Son, d: Daughter) : Cooking by d, Cleaning by s {
    fun setTable() {
        println("set table!")
    }
}

class Daughter : Cooking {
    override fun doCook() {
        println("do cook!")
    }
}
class Son : Cleaning {
    override fun doClean() {
        println("do clean!")
    }
}
interface Cooking {
    fun doCook()
}
interface Cleaning {
    fun doClean()
}