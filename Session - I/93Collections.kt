fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    var solarSystem = rockPlanets + gasPlanets
    println(solarSystem[0])
    println(solarSystem[1])


    //Difference between Array, List -> List is very dynamic.
    var newSolarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.indexOf("Earth")) //returns -1 if not

    for (i in 1..60){
        println(i)
    }

    var newNewSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    newNewSolarSystem.add("Pluto")
    newNewSolarSystem.add(3, "Theia")
    newNewSolarSystem.removeAt(9)
    newNewSolarSystem.remove("Mercury")
    println(newNewSolarSystem.contains("Pluto"))
    println("Future Moon" in newNewSolarSystem)


    var setSolarSystem = newNewSolarSystem.toSet()
    print(setSolarSystem)


    val dictSolarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    dictSolarSystem["Pluto"] = 5
    println(dictSolarSystem["Pluto"])
    print(dictSolarSystem)
}