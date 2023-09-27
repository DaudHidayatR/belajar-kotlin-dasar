fun printHello(name: String?):Unit{
    if(name != null)
        println("Hello $name")
    else
        println("Hi there!")
}
fun main(){
    printHello("Kotlin")
    printHello(null)
}