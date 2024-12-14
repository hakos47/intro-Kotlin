package Objects.Exercise3

class Character(
    override val name: String,
    override var health: Int,
    override var attack: Int,
    override var defense: Int,
    override var race: String
) :CharacterInterface {
    override fun toString(): String {
        return "Nombre: $name, Vida: $health, Ataque: $attack, Defensa: $defense, Raza: $race"
    }
    override fun takeDamage(damage: Int) {
        if (damage > defense) {
            health -= (damage - defense)
        } else {
            println("Tiene demasiada defesa, el ataque no hizo efecto")
        }

    }

    override fun isAlive(): Boolean {
        return health > 0
    }
}