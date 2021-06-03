package guava;

import com.google.common.base.Joiner;

public class GuavaTest {
    public static void main(String[] args) {
        String str = Joiner.on(",").join("aa", "bb");
        System.out.println(str);
    }
}
