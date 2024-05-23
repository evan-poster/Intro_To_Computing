package week2;

import week2.KotlinUtil;

public class JavaUtil {

    public static void main(String[] args) {
        KotlinUtil.comp_hello();
        KotlinUtil ku = new KotlinUtil();
        ku.hello();
    }

    public static void hello() {
        System.out.println("hello from java");
    }

    public static <T extends Comparable<T>> T whichIsBigger( T v1, T v2) {
        return v1.compareTo(v2) > 0 ? v1 : v2;
    }
}
