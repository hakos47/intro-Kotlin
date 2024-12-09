package entities

class Product(
    /** Atributos **/
    var id: Int,
    var name: String,
    var quantity: Float,
    var reference: String,
    var image: String,
    var description: String,
    var price: Float,


    ) : ProductUseCase {
    override fun isProductValid(product: Product): Boolean {
        return product.quantity >= quantity
        }
     /*{
    var discountPercent: Float = 0f
    fun recalculateTotalAmount() {

    }

    // objeto de la clase no de la entidad
    companion object {
        var discountPercent: Float = 3f

    }*/
}