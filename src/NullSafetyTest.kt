fun main() {
    var neverNull:String = "This can not be null"
    // neverNull=null  # this line wont work since it is not a nullable variable

    var nullable: String? = "You can keep a null"
    nullable=null //it can be null since we declare it as nullable by using ?
    println(nullable)
    println(stringLength(neverNull))
    //println(stringLength(nullable)) it showed a compiler error.
    // inferred type is String? but String was expected

}

fun stringLength(notNull:String):Int{
    return notNull.length
}