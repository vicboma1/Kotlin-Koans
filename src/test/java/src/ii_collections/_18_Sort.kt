package ii_collections

import ii_collections.data.shop
import ii_collections.data.sortedCustomers
import junit.framework.Assert
import org.junit.Test

class _18_Sort {
    @Test fun testGetCustomersSortedByNumberOfOrders() {
        Assert.assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
