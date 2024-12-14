package Objects

import Objects.Exercise3.Character

fun getName(errorString: String):String {
    var name: String = ""
    do {
        name = readlnOrNull() ?: ""
        if(name.isEmpty()) println(errorString)
    } while (name.isEmpty())
    return name
}

fun getNumber():Int {
    var number:Int = 0
    do{
        number = readlnOrNull()?.toIntOrNull() ?: 0
        if (number <= 0) println("Debes escribir un numero mayor que 0")
    }while (number <= 0)
    return number
}

fun exercise3() {
    println("Introduce un nombre:")
    val name = getName("Debes escribir un nombre")

    println("Introduce la vida inicial:")
    val health = getNumber()

    println("Introduce el ataque inicial:")
    val attack = getNumber()

    println("Introduce la defensa inicial:")
    val defense = getNumber()

    var  race = ""
    do {
        println("Introduce la raza (orco/humano/elfo):")
        race = getName("Debes escribir 'orco' 'humano' o 'elfo'")
        if (race != "orco" && race != "humano" && race != "elfo") println("\nRaza no valida!! \n")

    } while (race != "orco" && race != "humano" && race != "elfo")

    println("\n Creando \n")

    val player = Character(name, health, attack, defense, race)
    println(player)
}