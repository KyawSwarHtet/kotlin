class Person{
    lateinit var name : String
    var age: Int =0// premative data type  ma loz initialize lote ko pay ya mal

    fun setValue(name: String,age : Int){
        this.name=name
        this.age=age

    }

}
fun main(){
    var person=Person()
    person.setValue("maung maug",34)
}