class Calculator constructor(a:Int,b:Int){// primary constructor
   init {// init block
    var c =a+b
    println(c)
   }
    companion object{// static nae tu tal
        var value =10
    }
}
class Sum{
    constructor(a: Int,b: Int) {// secondary constructor

        var c =a + b
                println(c)
    }

}

fun main() {
    Calculator(3,5)
  //  println(calculator.c)// primary constructor/ a paw sone mhar write har loz
    Calculator.value// companion object
    Sum(3,7)
}