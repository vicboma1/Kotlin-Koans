package ii_collections

import ii_collections.data.customers
import ii_collections.data.nathan
import junit.framework.Assert
import org.junit.Test

class _19_Sum {
    @Test fun testGetTotalOrderPrice() {
        Assert.assertEquals(148.0, customers[nathan]!!.getTotalOrderPrice())
    }
}
