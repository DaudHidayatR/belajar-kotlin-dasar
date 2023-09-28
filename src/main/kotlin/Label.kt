fun test(name: String, param: (String) -> Unit): Unit=param(name)

fun main() {
    loop1@ for (i in 1..10) {
        loop2@ for (j in 1..10) {
            if (i == 5 && j == 5) {
                break@loop1
            }
            println("$i * $j = ${i * j}")
        }
    }
    loop1@ for (i in 1..10) {
        loop2@ for (j in 1..10) {
            if (i == 5 && j == 5) {
                continue@loop1
            }
            println("$i * $j = ${i * j}")
        }
    }
    test("") testLabel@{
        if (it == "") {
        return@testLabel
        }else println("daud")
    }

}
