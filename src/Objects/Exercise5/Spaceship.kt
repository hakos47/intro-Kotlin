package Objects.Exercise5

open class Spaceship(
    open val name: String,
    open var health: Int,
    open var crew: Int
) {
    override fun toString(): String {
        return "Spaceship(name='$name', health=$health, crew=$crew)"
    }
}
