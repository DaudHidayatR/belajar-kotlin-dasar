fun sum (a:Int, b:Int):Int {
    return a + b
}
fun bagi (a:Int, b:Int):Int {
    if (a==0||b == 0) {
        return 0
    }else {
        return a / b
    }
}

fun main() {
    val result = sum(10, 20)
    println(result)

    val result2 = bagi(10, 20)
    println(result2)
}