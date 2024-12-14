package Objects.Exercise1

interface BrandInterface {
    val brand: String
    val year: Int
    val country: String

    companion object {
        fun create(brand: String, year: Int, country: String): BrandInterface {
            return Brand(brand, year, country)
        }
    }
}
