inline fun hello(fisrtName: () -> String,
                noinline lastName:()->String ): String {
    return "Hello ${fisrtName()} ${lastName()}"
}
fun main() {
    println(hello ({ "Daud" }, {"hidayat"}))
    println(hello ({ "Daud" }, {"Ramadhan"}))

}