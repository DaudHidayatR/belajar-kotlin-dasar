fun main() {
    val array: Array<String> = arrayOf("Kotlin", "Java", "Scala", "Groovy")
    array.set(1, "Java 8")
    val kotlin: String = array[0]
    val java: String = array.get(1)
    val scala: String = array.get(2)

    println(kotlin)
    println(java)
    println(scala)

    val member = arrayOfNulls<String>(10)
    member[0] = "Kotlin"
    println(member.size)


}