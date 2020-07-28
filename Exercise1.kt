import java.util.*

fun main(){
    var scanner=Scanner(System.`in`)
    println("enter the the square or rectangle or parallelogram or triangle or trapezoid or regular or circle")
    var user1= readLine()
    when(user1){
        "square"-> {
            println("enter the number for square")
            var a1=scanner.nextInt();
            square(a1)}
        "rectangle"->{
            println("enter the number 1 and number 2 for rectangle")
            var a2 = scanner.nextInt()
            var a3 = scanner.nextInt()
            rectangle(a2, a3)
        }
        "parallelogram"->{
            println("enter the number 1 ,number 2 and hight for parallelogram")
            var a4=scanner.nextInt()
            var a5=scanner.nextInt()
            var h=scanner.nextInt()
            parallelogram(a4,a5,h)
        }
        "triangle"->{
            println("enter the number 1 ,number 2, number 3and hight for triangle")
            var a4=scanner.nextInt()
            var a5=scanner.nextInt()
            var a6=scanner.nextInt()
            var h=scanner.nextInt()
            triangle(a4,a5,a6,h)
        }"trapezoid"->{
        println("enter the number 1 ,number 2, number 3and number 4 hight for trapezoid")
        var a4=scanner.nextInt()
        var a5=scanner.nextInt()
        var a6=scanner.nextInt()
        var a7=scanner.nextInt()
        var h=scanner.nextInt()
        trapezoid(a4,a5,a7,a6,h)
    }
        "regular"->{
            println("enter the number 1 ,number 2 and number 3 for regular polygon")
            var a4=scanner.nextInt()
            var a5=scanner.nextInt()
            var h=scanner.nextInt()
            regular(a4,a5,h)
        }
        "circle"->{
            println("enter the number 1 ,number 2 and number 3 for circle")
            var a4=scanner.nextInt()
            var a5=scanner.nextInt()
            var h=scanner.nextInt()
            circle(a4,a5,h)
        }
        else -> println("you are wrong")
    }
}
   /* var user1= readLine()
    if (user1 == "square"){
        println("enter the number for square")
        var a1=scanner.nextInt();
        square(a1)
    }
    else if(user1 == "rectangle") {
        println("enter the number 1 and number 2 for rectangle")
        var a2 = scanner.nextInt()
        var a3 = scanner.nextInt()
        rectangle(a2, a3)
    }
    else if (user1=="parallelogram"){
        println("enter the number 1 ,number 2 and hight for parallelogram")
        var a4=scanner.nextInt()
        var a5=scanner.nextInt()
        var h=scanner.nextInt()
        parallelogram(a4,a5,h)
    }
    else println("you are wrong") }*/





fun square(a:Int) {

    var squareper= 4*a
    println("the perimeter of square $squareper")
    var sqarea= a*a
    println("the area of square is $sqarea")

}
fun rectangle(a: Int,b: Int) {
    var rectper=((2*a)+(2*b))
    println("the perimeter of rectangle $rectper")
    var rectarea= a*b
    println("the area of rectangle is $rectarea")
}
fun parallelogram(a: Int,b: Int ,c: Int) {
    var paraper=((2*a)+(2*b))
    println("the perimeter of parallelogram is $paraper")
    var pararea = b*c
    println("the area of parallelogram is $pararea")
}
fun triangle(a: Int,b: Int ,c: Int,h:Int) {
    var triper=(a+b+c)
    println("the perimeter of triangle is $triper")
    var triarea = (0.5*(b*h))
    println("the area of triangle is ${triarea.toDouble()}")
}
fun trapezoid(a: Int,b1: Int ,b2:Int,c: Int,h:Int) {
    var trapper=(a+b1+b2+c)
    println("the perimeter of trapezoid is $trapper")
    var traparea = (0.5*((b1+b2)*h))
    println("the area of trapezoid is ${traparea.toDouble()}")
}
fun regular(a: Int,n: Int ,s: Int) {
    var regper=(n*s)
    println("the perimeter of regular is $regper")
    var regarea = (0.5*(regper*a))
    println("the area of regular is ${regarea.toDouble()}")
}
fun circle(d: Int,r: Int ,c: Int) {
    var circper=((22/7)*d)
    println("the perimeter of circle is $circper")
    var circarea = (22/7)*(r*r)
    println("the area of circle is $circarea")
}
