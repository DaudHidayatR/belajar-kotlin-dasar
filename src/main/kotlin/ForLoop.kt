fun main() {
    val array = arrayOf("Daud", "Hidayat", "Ramadhan", "Siraj", "Bintang")
    var total = 0
    for (i in array) {
        println(i)
        total++
    }
    println("Total perulangan = $total")
    val ukuran = array.size
    for (i in 0..ukuran-1 step 1) {
        println("index ke $i = ${array[i]}")
    }
}