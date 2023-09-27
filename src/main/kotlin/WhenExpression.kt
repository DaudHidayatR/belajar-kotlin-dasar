fun main() {
    var nilai = "A"
    when (nilai) {
        "A" -> println("Sangat Baik")
        "B" -> println("Baik")
        "C" -> println("Cukup")
        "D" -> println("Kurang")
        "E" -> println("Sangat Kurang")
        else -> println("Nilai tidak valid")
    }
    val nilai2 = "A"
    when (nilai2) {
        "A","B","C" -> println("lulus")
        else -> println("tdak lulus")
    }
//    use array
    val nilai3 = "A"
    val nilaiLulus = arrayOf("A","B","C")
    when (nilai3) {
        in nilaiLulus -> println("lulus")
        !in nilaiLulus -> println("tdak lulus")
    }
//        when Expression Is
        val name = "Daud Hidayat R"
        when (name) {
            is String -> println("Nilai ini adalah String")
            !is String -> println("Nilai ini bukan String")

    }
}