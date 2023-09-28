

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransformed = transformer(name)
        return "Hello $nameTransformed"
    }
    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("Daud", lambdaUpper))
    println(hello("Daud", { value: String -> value.toUpperCase() }))

    val result = hello("Daud") { value: String ->
        value.toUpperCase()
    }
}