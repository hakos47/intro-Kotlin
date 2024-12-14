package Objects.Exercise1

class Brand(
    override val brand: String,
    override val year: Int,
    override val country: String
) : BrandInterface {
    override fun toString(): String {
        return "$brand $year $country"
    }
    companion object {
        fun create(brand: String, year: Int, country: String) : BrandInterface {
            return Brand(brand, year, country)
        }
    }
}