import java.util.*

fun main(){
    println("enter something")
    var a= readLine()
    when(a){
        "sun"-> println(a)
        else-> println("none")
    }

    var scanner=Scanner(System.`in`)
    println("enter number")
    var input = scanner.nextInt();
    var result= when (input){
        1-> "one"
        2->"two"
        in 3..8 ->"between 3 and 8"
        10,12,14->"even"
        else-> "none"
    }
    println("$result")

}