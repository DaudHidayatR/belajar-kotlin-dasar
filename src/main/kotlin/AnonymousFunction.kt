fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransformed = transformer(name)
        return "Hello $nameTransformed"
    }
    val upper =  fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }
    println(hello("Daud", upper))
    println(hello("Daud", fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }))
}