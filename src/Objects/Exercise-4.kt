package Objects

import Objects.Exercise3.Character


fun exercise4() {
    val player1 = Character("A", 100, 40, 10, "orco")
    val player2 = Character("B", 100, 20, 30, "elfo")
    val damage = player2.takeDamage(player1.attack)

    println("${player1.name} ataca a ${player2.name} y reduce su salud en ${damage} ")


}