fun main() {
    hello()
    println(sum())
    print(sum1(4,8))
    println(sumFun(5,7))
}

    fun hello() {
        println("hello....")//no return type
    }
fun sum() :Int{
    return 2+4 // return type

}
//fun sum1(num1:Int,num2:Int): Double {//2 argument and return type
 //   return (num1+num2).toDouble()
//}
fun sum1(num1:Int,num2:Int): Double = (num1+num2).toDouble()// pluse integer to double
fun sum2(num3:Int,num4:Int):Double=(num3+num4).toDouble()//single line argument and return type
var sumlambda = {a:Int,b:Int -> a+b}//no return type by symbol arrow key(lambda fucntion)
var sumlambada :( Int, Int )-> Double={x,y -> (x+y).toDouble()}// double by arrow key symbol (Lanbada fucntion)


var sumFun = fun (a: Int,b: Int): Int {
    return a+b
    //anonymous function no need function name
}
var lambda ={a:Int,b:Int -> a+b}
fun lambFunc (func: (Int,Int)-> Int) {

    var result = func(4,6)
    println("lambda $result")
}