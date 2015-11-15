package ii_collections

import ii_collections.data.groupedByCities
import ii_collections.data.shop
import junit.framework.Assert
import org.junit.Test

class _20_Group_By {
    @Test fun testGroupCustomersByCity() {
        Assert.assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
