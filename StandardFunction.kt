fun main() {
    var str = "hello world"

    str.let {
        println("$it !!!")// (it) reference value
    }
    var a = 2
    var b = 3
    //  a= a.let {
    //    it+3//it =a =2

    a = a.let { it + 2 }.let {
        val i = it; i }

    println(a)

    // run
    str = run {
        var str = "hello !!!"
        str
    }
    println(str)


// also
    var c = 1
    c = c.also {
        it - 1
    }
    println(c)

    //apply  object tu tar ko bone htoke p use tar

    data class Person(var name: String,var age : Int)
        var person = Person("maung maung ", 23)

    println(person.name)
    println(person.age)

    person.apply {
        this.name="jhon"
        this.age=21
    }
    println(person.name)
    println(person.age)


//with // parameter nae lote tar

    with (person){
        this.name = "manung"
        this.age = 42

    }
    println(person.name)
    println(person.age)


}
