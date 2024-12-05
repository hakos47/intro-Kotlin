package entities

interface ProductUseCase {
    fun isProductValid(product: Product): Boolean
}