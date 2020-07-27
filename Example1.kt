import java.util.*

fun main() {
    var max = 0

    println("enter number one")
    var scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    println("enter number two")
    var b = scanner.nextInt()
    println("ener nuber threee")
    var c = scanner.nextInt()
    if (a > b && a > c) {
        //println(a)
        max = a
    } else if (b > a && b > c) {
        //println(b)
        max = b

    } else  //
        max = c// println(c)
    println("the greatest number is $max ")


    var x = 14
    if (x in 1..10){
        println(x)
    }
    else println(" not in range")
}

