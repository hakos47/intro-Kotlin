package Objects.Exercise3

interface CharacterInterface {
    val name : String
    var health : Int
    var attack : Int
    var defense : Int
    var race: String

    fun takeDamage(damage: Int)

    fun isAlive(): Boolean
}