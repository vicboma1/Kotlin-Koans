package i_introduction._6_Data_Classes

import org.junit.Assert
import org.junit.Test


public class _07_Data_Classes {
    @Test fun testListOfPeople() {
        Assert.assertEquals("[Person(name=Alice, age=29), Person(name=Bob, age=31)]", task7().toString())
    }
}