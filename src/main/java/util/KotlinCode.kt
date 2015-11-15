package java.util

import com.google.common.collect.Sets

/**
 * Created by vicboma on 15/11/15.
 */
class KotlinCode(){
    val set: MutableSet<String> = Sets.newHashSet<String>()
    init{
        set.add(this.javaClass.name)
    }
}
