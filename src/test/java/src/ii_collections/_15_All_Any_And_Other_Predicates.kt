package ii_collections

import ii_collections.data.*
import junit.framework.Assert
import org.junit.Test

class _15_All_Any_And_Other_Predicates {
    @Test fun testCustomerIsFromCity() {
        Assert.assertTrue(customers[lucas]!!.isFrom(Canberra))
        Assert.assertFalse(customers[lucas]!!.isFrom(Budapest))
    }

    @Test fun testAllCustomersAreFromCity() {
        Assert.assertFalse(shop.checkAllCustomersAreFrom(Canberra))
    }

    @Test fun testAnyCustomerIsFromCity() {
        Assert.assertTrue(shop.hasCustomerFrom(Canberra))
    }

    @Test fun testCountCustomersFromCity() {
        Assert.assertEquals(2, shop.countCustomersFrom(Canberra))
    }

    @Test fun testAnyCustomerFromCity() {
        Assert.assertEquals(customers[lucas], shop.findAnyCustomerFrom(Canberra))
    }
}
