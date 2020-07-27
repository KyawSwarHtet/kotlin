fun main(){
    for (a in 1..6){
        println("$a")
    }
    for (a in 1..10 step 2){
        print("$a  ")
    }
println()
    for (a in 10 downTo 1 step  2){
        print("$a  ")
    }
    println()

    var arrNumb = arrayOf(1,2,3,4,5,6,7)
    for(arr in arrNumb){
        print("$arr   ")
    }

    for (index in arrNumb.indices){
        print("$index  ")
        println("${arrNumb[index]}")// show the array index
    }
    for((index,value) in arrNumb.withIndex()){
        println("$index value : $value")
    }

    var str ="android"
    for (a in str){
        print("$a   ")
    }
    var x =10
    while (x>0){
        print("$x ")
        x--
    }
    var str1="youtube player"
    var y=4
    do {
        println("$x  ")
        y++
    }while (y<5)
}