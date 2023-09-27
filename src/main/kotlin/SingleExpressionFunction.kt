fun double(x: Int): Int = x * 2
fun hi(name: String): String = "Hi $name"

fun main() {
    val result = double(2)
    println(result)
    hi("Kotlin")
}