fun main() {
    //Integer Number
    val age: Int = 200
    println(age)

//    floating point number
    val value: Float = 98.98F
    println(value)
    val radius: Double = 11213242435.356464758
    println(radius)

//    literals
    val decimalLiteral: Int = 100
    println(decimalLiteral)
    val hexadecimalLiteral: Int= 0xFF
    println(hexadecimalLiteral)
    val binaryLiteral: Int = 0b0001
    println(binaryLiteral)

//    underscore in number
    val ages: Byte = 3_0
    println(ages)
    val height: Int = 1_7_0
    println(height)
    val distance: Short = 2_000
    println(distance)
    val balance: Long = 100_000_000L
    println(balance)

//    conversion
    val number: Int = 100
    val byte: Byte = number.toByte()
    println(byte)
    val short: Short = number.toShort()
    println(short)
    val int: Int = number.toInt()
    println(int)
    val float: Float = number.toFloat()
    println(float)
    val double: Double = number.toDouble()
    println(double)

}