fun main() {
    val trafficColor = "green" //giving black returns error

    when (trafficColor) {
        "green" -> print("GO!")
        "yellow" -> print("Wait")
        "red" -> print("Stop!")
        //else -> print("Not a traffic Color.")
    }
    val message = when (trafficColor) {
        "green" -> "GO!"
        "yellow" -> "Wait"
        "red" -> "Stop!"
        else -> "Not a traffic Color."
    }
}