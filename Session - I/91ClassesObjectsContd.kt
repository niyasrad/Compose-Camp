class SmartDevice(val name: String, val category: String) {
    var deviceStatus= "online"
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    fun turnOn(){
        deviceStatus = "online"
        println("${name} is turned on.")
    }

    fun turnOff(){
        deviceStatus = "offline"
        println("${name} is turned off.")
    }
}

fun main() {
    val smartDevice = SmartDevice("Chinese", "TV", 0)
    print(smartDevice.deviceStatus)
    smartDevice.turnOff()
    smartDevice.deviceStatus
}