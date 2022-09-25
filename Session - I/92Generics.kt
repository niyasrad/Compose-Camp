class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)
class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

/*class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
*/
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty {
    EASY, MEDIUM, HARD
}

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.EASY)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.MEDIUM)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    print(question1)
}