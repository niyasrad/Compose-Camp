import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println("Is the Weather Cold? ")
    val isTheWeatherCold = read.nextBoolean()

    //boolean, number == , yes/no String
    if (isTheWeatherCold) {
        print("Wear your jacket.")
    }
    else {
        print("Don't wear your jacket.")
    }
}