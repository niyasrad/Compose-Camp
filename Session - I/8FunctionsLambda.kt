fun main() {
    val selectChoice : (Int, Int) -> Int =
        { num1, num2 ->
            val choice = num1 + num2
            choice
        }

    println(selectChoice(5, 5))
}
// previously used with when statement, while printing a value in println