package Objects.Exercise5

class Carrier(
    override val name: String,
    override var health: Int,
    override var crew: Int,
    var fighters: MutableList<Fighter>,
    var shots: Int = 0
) : Spaceship(name, health, crew) {
    override fun toString(): String {
        return "Carrier(name='$name', health=$health, crew=$crew, fighters=${fighters.size}, shots=$shots)"
    }

    fun shoot() {
        if (shots > 0) {
            shots--
            println("$name dispara. Disparos restantes: $shots")
        } else {
            println("$name no tiene disparos.")
        }
    }

    fun launchFighter(): Fighter? {
        return if (fighters.isNotEmpty()) {
            val launchedFighter = fighters.removeAt(0)
            println("$name lanza un caza: ${launchedFighter.name}. Cazas restantes: ${fighters.size}")
            launchedFighter
        } else {
            println("$name no tiene cazas para lanzar.")
            null
        }
    }
}