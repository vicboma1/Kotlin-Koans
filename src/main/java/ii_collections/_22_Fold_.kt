package ii_collections

fun example9() {
    val product = listOf(1, 2, 3, 4).fold(1, { partProduct, element -> element * partProduct })
    product == 24
}

// The same as
fun whatFoldDoes(): Int {
    var product = 1
    listOf(1, 2, 3, 4).forEach { element -> product = element * product}
    return product
}

fun Shop.getProductsOrderedByAllCustomers(): Set<Product> {
    val allOrderedProducts = customers.flatMap({it.orderedProducts}).toSet()
    return customers.fold(allOrderedProducts, {
        orderedByAll, customer ->
        val orderedProducts = customer.orders.flatMap { it.products }.toSet()
        orderedByAll.intersect(orderedProducts) // [X] intersect [X;C;V] = [X] == retainAll
    })
}
