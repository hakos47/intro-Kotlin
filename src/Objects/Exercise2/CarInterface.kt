package Objects.Exercise2

interface CarInterface {
    val model : String
    val productionDate : Int
    val cv: Int
    val brand : String

    companion object {
        fun create(model: String, year:Int, cv: Int, brand: String): Car {
            return Car(model, year, cv, brand)
        }
    }
}