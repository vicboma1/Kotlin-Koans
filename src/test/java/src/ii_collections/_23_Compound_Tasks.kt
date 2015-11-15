package ii_collections

import ii_collections.data.*
import ii_collections.shopBuilders.customer
import ii_collections.shopBuilders.order
import junit.framework.Assert
import org.junit.Test

class _23_Compound_Tasks {
    @Test fun testGetCustomersWhoOrderedProduct() {
        Assert.assertEquals(setOf(customers[reka], customers[asuka]), shop.getCustomersWhoOrderedProduct(idea))
    }

    @Test fun testMostExpensiveDeliveredProduct() {
        val testShop = ii_collections.shopBuilders.shop("test shop for 'most expensive delivered product'") {
            customer(lucas, Canberra) {
                order(isDelivered = false, products = idea)
                order(reSharper)
            }
        }
        Assert.assertEquals(reSharper, testShop.customers[0].getMostExpensiveDeliveredProduct())
    }

    @Test fun testNumberOfTimesEachProductWasOrdered() {
        Assert.assertEquals(3, shop.getNumberOfTimesProductWasOrdered(reSharper))
    }
}
