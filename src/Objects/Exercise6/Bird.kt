package Objects.Exercise6

class Bird(
    override val name: String,
    override val wingSpan: Double
) : BirdInterface {
    override val species: String = "Aves"
    override val habitat: String = "Cielos y bosques"
    override val diet: String = "Herbívoro / Omnívoro"

    override fun makeSound(): String {
        return "$name, un pájaro con una envergadura de $wingSpan metros, canta: ¡Pío pío!"
    }

    override fun fly(): String {
        return "$name está volando alto en el cielo."
    }
}
