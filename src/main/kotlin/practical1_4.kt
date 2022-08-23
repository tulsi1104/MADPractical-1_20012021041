fun main() {
    println("Enter any number")
    var n: Int = readLine()!!.toInt()
    println(
        if (n % 2 == 0) {
            ("$n is even")
        } else {
            ("$n is odd")
        }
    )
}