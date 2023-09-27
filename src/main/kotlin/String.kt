fun main() {
    val firstName: String = "Daud"
    val lastName: String = "Hidayat"
    val fullName: String = "Daud Hidayat Ramadhan"
    val address: String = """
        |Jl. Raya Cipadung No. 9
        |Kota Bandung
        |Jawa Barat"""
    val address2: String = """
        |Jl. Raya Cipadung No. 9,
        |Kota Bandung,
        |Jawa Barat
        """.trimMargin()
    val fullName2: String = "$firstName $lastName"

    println(firstName)
    println(lastName)
    println(fullName)
    println(address)
    println(address2)
    println(fullName2)
}