package Objects.Exercise6

abstract class Animal(
    override val name: String,
    override val species: String,
    override val habitat: String,
    override val diet: String
):AnimalInterface {
    override fun toString(): String {
        return "Animal(name='$name', species='$species', habitat='$habitat', diet='$diet')"
    }

    override fun makeSound() :String {
        return "$name, un $species, emite un sonido genérico."
    }
}