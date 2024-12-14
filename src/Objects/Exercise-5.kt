package Objects

import Objects.Exercise5.Carrier
import Objects.Exercise5.Fighter

fun exercise5() {
    val fighter1 = Fighter(name = "StarShip 1", health = 100, crew = 1, shots = 5)
    val fighter2 = Fighter(name = "StarShip 2", health = 100, crew = 1, shots = 5)
    val fighter3 = Fighter(name = "StarShip 3", health = 100, crew = 1, shots = 5)
    val fighterList = mutableListOf(fighter1, fighter2, fighter3)

    val carrier = Carrier(
        name = "Star Destroyer",
        health = 1000,
        crew = 500,
        fighters = fighterList,
        shots = 20
    )

    println(carrier)

    carrier.shoot()
    carrier.launchFighter()
    carrier.launchFighter()

    println(carrier)
}