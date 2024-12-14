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
    override fun takeDamage(damage: Int): Int {
        var realDamage = damage - defense
        if (damage > defense) {
            health -= realDamage
        } else {
            realDamage = 0
            println("Tiene demasiada defesa, el ataque no hizo efecto")
        }
        return realDamage

    }

    override fun isAlive(): Boolean {
        return health > 0
    }
}