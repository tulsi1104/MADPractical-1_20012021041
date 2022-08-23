fun main() {
    println("Enter Month:(eg.:11)")

    var mn: Int = readLine()!!.toInt()
    when (mn) {
        1 -> println("January")
        2 -> println("Feb")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("Aug")
        9 -> println("Sept")
        10 -> println("October")
        11 -> println("Nov")
        12 -> println("Dec")
        else -> {
            println("Enter proper number")
        }
    }
}