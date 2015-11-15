package ii_collections

import ii_collections.data.*
import junit.framework.Assert
import org.junit.Test

class _14_Filter_Map {
    @Test fun testCitiesCustomersAreFrom() {
        Assert.assertEquals(setOf(Canberra, Vancouver, Budapest, Ankara, Tokyo), shop.getCitiesCustomersAreFrom())
    }

    /**
     * Returns the list of the customers who live in the city 'city'
     */
    @Test fun testCustomersFromCity() {
        Assert.assertEquals(listOf(customers[lucas], customers[cooper]), shop.getCustomersFrom(Canberra))
    }
}
