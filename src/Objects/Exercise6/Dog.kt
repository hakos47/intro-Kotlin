package Objects.Exercise6

class Dog(
    override val name: String,
    override val breed: String
) : DogInterface {
    override val species: String = "Canis lupus familiaris"
    override val habitat: String = "Doméstico"
    override val diet: String = "Omnívoro"

    override fun makeSound(): String {
        return "$name, un perro de raza $breed, ladra: ¡Guau guau!"
    }

    override fun wagTail(): String {
        return "$name mueve la cola felizmente."
    }
}

