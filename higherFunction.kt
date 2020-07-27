import java.util.*

fun main(){
    println("enter number 1 and number 2")
    var scanner=Scanner(System.`in`)
    var num1= scanner.nextInt()
    var num2=scanner.nextInt()


   // calculate(::sumFunc)// 2,4 scope resolution for higher order function
    calculateone(num1,num2, ::sumFunc)
    calculateone(num1,num2, ::subFunc)
    calculateone(num1,num2, ::multFunc)
    calculateone(num1,num2, ::divFunc)
}

fun sumFunc(a:Int,b:Int): Int {//parameter lote tar //argument 2 ku par tae fucntion lote tar
    return a+b
}
fun subFunc(a:Int,b: Int):Int{
    return a-b

}
fun multFunc(a: Int,b: Int):Int{
    return a*b
}
fun divFunc(a: Int,b: Int):Int{
    return a/b
}
/*fun calculate(function:(Int,Int) -> Int){
    val result = function(2,4)
    println("result : $result")
}*/
fun calculateone(a:Int,b: Int,function: (Int, Int) -> Int)
{
    val result1=function(a,b)
    println("result  $result1")
}