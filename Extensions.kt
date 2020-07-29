fun main() {
    var str="ABSCESASFADF"
    println(str.lowercase())
   var one = 14
    println(one.str())
   // println(one?.str()) // null lote loz ya tal (?) use yin
   // var one = null
    //println(one!!.str())// null လုံး၀ မဖစၤ ရဘူး


}
/*fun uppercase (input:String):String{
    return input.toUpperCase()/// normal write yin thone tar
}*/
fun String.lowercase():String{//extrnsion write yin use tar
    return toLowerCase()
}
fun Any.str(): String{//null tot ma ya buu
    return toString()
}