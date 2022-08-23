fun main() {
    var l1 = listOf(43,2,15,6,9)
    var maxn:Int

    maxn=l1[0]
    for (i in l1) {
        if(maxn<i)
        {
            maxn=i
        }
    }
    println("Largest  number is: $maxn")
}