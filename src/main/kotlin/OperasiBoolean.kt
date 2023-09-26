fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 80

    val lulusUjian = nilaiUjian > 75
    val lulusAbsen = nilaiAbsen > 75

    val apakahLulus = lulusUjian && lulusAbsen
    println(apakahLulus)
}