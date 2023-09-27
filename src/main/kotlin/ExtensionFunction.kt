fun String.hello(): String = "Hello $this"

fun main() {
    val name = "Kotlin"
    val result:String = name.hello()
    println(result)
}