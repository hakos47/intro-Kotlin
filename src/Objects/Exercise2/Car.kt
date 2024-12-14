package Objects.Exercise2

class Car(
    override val model: String,
    override val productionDate: Int,
    override val cv: Int,
    override val brand: String
) :CarInterface {
    override fun toString(): String {
        return "$model $productionDate $cv $brand -> Car"
    }
    companion object {
        fun create(model: String, year: Int, cv:Int, brand: String): Car {
            return Car(model, year, cv, brand)
        }
    }
}