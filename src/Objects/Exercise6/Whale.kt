package Objects.Exercise6

class Whale(
    override val name: String,
    override val size: Double
) : WhaleInterface {
    override val species: String = "Cetáceo"
    override val habitat: String = "Océano"
    override val diet: String = "Plancton / Carnívoro"

    override fun makeSound(): String {
        return "$name, una ballena de $size metros, emite un canto profundo bajo el agua."
    }

    override fun swim(): String {
        return "$name nada majestuosamente en el océano."
    }
}
