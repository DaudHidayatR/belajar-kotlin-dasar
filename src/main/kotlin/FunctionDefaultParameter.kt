fun hello (firstName: String, lastName: String? = "ya"){
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("hello $firstName $lastName")
    }
}

fun main() {
    hello("daud")
    hello("daud", "hidayat")
    hello("")
}