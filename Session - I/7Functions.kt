fun main() {
    name()
    name()
    name()

    repeat(10){
        println(halfMyNumber(it))
    }
}

fun name(){
    println("my name is niyas")
}

fun halfMyNumber(no: Int): Double{
//     println(no)
    return no/2.0
}