package guava;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.Map;

public class GuavaTest {
    public static void main(String[] args) {
        String result = Joiner.on(",").join("aa", "bb");
        System.out.println(result);
        result = Joiner.on("; ").skipNulls().join("Harry", null, "Ron", "Hermione");
        System.out.println(result);
        result = Joiner.on("; ").useForNull("null").join("Harry", null, "Ron", "Hermione");
        System.out.println(result);
        result = Joiner.on(",").join(Arrays.asList(1, 5, 7));
        System.out.println(result);
        Map map = ImmutableMap.of("k1", "v1", "k2", "v2");
        result = Joiner.on("; ").withKeyValueSeparator("=").join(map);
        System.out.println(result);
        StringBuilder sb = new StringBuilder("result:");
        Joiner.on(" ").appendTo(sb, 1, 2, 3);
        System.out.println(sb);//result:1 2 3
    }
}
