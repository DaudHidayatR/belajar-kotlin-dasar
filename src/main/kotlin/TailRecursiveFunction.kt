fun main() {
    tailrec fun display(value: Int){
        println("Value is $value")
        if(value > 0){
            display(value - 1)
        }
    }
    tailrec fun factorialRecursive(value: Int, total: Int = 1) {
        println("Value is $value")
        if(value > 0){
            factorialRecursive(value - 1, total*value)
        }

    }
    display(1000000)
    factorialRecursive(1000000,2)
}
