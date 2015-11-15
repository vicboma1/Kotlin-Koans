package ii_collections

import ii_collections.data.customers
import ii_collections.data.shop
import junit.framework.Assert
import org.junit.Test

class _13_Introduction {
    @Test fun testSetOfCustomers() {
        Assert.assertEquals(shop.getSetOfCustomers(), customers.values.toSet())
    }
}
