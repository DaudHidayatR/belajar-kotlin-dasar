fun main() {

    var counter: Int = 0
// closure dapat berinteraksi dengan data' sekitar scope yang sama
    val lambdaIncrement: ()-> Unit= {
        println("Lambda increment")
        counter++
    }
    val anonymousIncrement = fun () {
        println("Anonymous increment")
        counter++
    }
    fun functionIncrement() {
        println("Function increment")
        counter++
    }
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
}