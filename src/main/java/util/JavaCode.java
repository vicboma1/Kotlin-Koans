package java.util;

import com.google.common.collect.Sets;

public class JavaCode {
    public static Set<String> set = Sets.newHashSet();

    public JavaCode() {
        set.add(this.getClass().getName());
    }
}
