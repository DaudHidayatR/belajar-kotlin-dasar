fun toUpper(value: String): String = value.toUpperCase()
fun main() {
    val contohlamda:(String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }
    val result = contohlamda("Daud", "Hidayat")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Daud"))

    val toUpper:(String) -> String = ::toUpper
    println(toUpper("Daud"))
}