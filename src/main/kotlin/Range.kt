fun main() {
    val range = 1..10
    println(range.count())
    println(range.contains(5))
    println(range.first)
    println(range.last)
    println(range.step)

    val down = 10.downTo(1) step 2
    println(down.count())
    println(down.contains(5))
    println(down.first)
    println(down.last)
    println(down.step)

}