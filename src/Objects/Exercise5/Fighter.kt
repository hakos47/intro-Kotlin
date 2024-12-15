package Objects.Exercise5

class Fighter(
    override val name: String,
    override var health: Int,
    override var crew: Int,
    override var shots: Int
) : Spaceship(name, health, crew) , FighterInterface {
    override fun shoot() {
        if (shots > 0) {
            shots--
            println("$name dispara. Disparos restantes: $shots")
        } else {
            println("$name no tiene disparos.")
        }
    }
    override fun toString(): String {
        return "Fighter(name='$name', health=$health, crew=$crew), shots=$shots"
    }
}