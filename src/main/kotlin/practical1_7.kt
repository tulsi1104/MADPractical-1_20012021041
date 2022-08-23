fun main() {
    println("Enter a number")
    var n: Int = readLine()!!.toInt()
    println("Factorial of given number :")
    println(fact(n))
}

tailrec fun fact(a:Int):Long{
    if(a<=1) {
        return 1
    }
    else {
        return fact(a-1)*a
    }
}
