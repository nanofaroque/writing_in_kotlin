package class_test

fun main() {
    val omar=Person("Faroque")
    println(omar.hello())
}

class Person(val name: String){
    fun hello(){
        println("Hello $name")
    }
}