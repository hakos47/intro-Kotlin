package Objects.Exercise5

interface CarrierInterface : SpaceshipInterface {
    var fighters: MutableList<Fighter>
    var shots: Int

    fun shoot()

    fun launchFighter(): Fighter?
}
