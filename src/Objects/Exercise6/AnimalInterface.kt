package Objects.Exercise6

interface AnimalInterface {
    open val name: String
    open val species: String
    open val habitat : String
    open val diet : String

    fun makeSound(): String
}