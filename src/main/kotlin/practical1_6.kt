fun main() {
    val add =add(6,3)
    val mns =minus(6,3)
    val multi =multiply(6,3)
    val div =division(6,3)
    println("a is 6 and b is 3")
    println("Addition is :$add")
    println("minus is :$mns")
    println("multi :$multi")
    println("division :$div")
}
fun add( num1:Int , num2:Int ):Int
{
    return num1+num2
}
fun minus( num1:Int , num2:Int ):Int
{
    return num1-num2
}
fun multiply( num1:Int , num2:Int ):Int
{
    return num1 * num2
}
fun division( num1:Int , num2:Int ):Int {
    return num1 / num2
}