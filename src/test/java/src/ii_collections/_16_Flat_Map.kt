package ii_collections

import ii_collections.data.*
import junit.framework.Assert
import org.junit.Test

class _16_Flat_Map {
    @Test fun testGetOrderedProductsSet() {
        Assert.assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test fun testGetAllOrderedProducts() {
        Assert.assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}
