fun main() {
    //var, val
    var camelCase = "Niyas"
    //var camelCase = "Sriram"
    camelCase = "Sriram"

    val camelCase1 = "Niyas"
    //camelCase1 = "Sriram"
    println(camelCase + " " + camelCase1)

    val unreadCount = 32
    val readCount = 64
    println("You have ${unreadCount + readCount} total messages in your inbox.") //to be referenced during lambda

    var sum: Int
    sum = unreadCount + readCount
    var double1 = sum.toDouble()
    print(double1)
}
