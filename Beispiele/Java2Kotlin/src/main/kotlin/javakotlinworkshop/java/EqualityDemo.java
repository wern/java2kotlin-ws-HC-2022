package javakotlinworkshop.java;

import java.nio.charset.Charset;

public class EqualityDemo {

    public static void main(String[] args) {
        var a = "Hallo KKON";
        var b = new String(a.getBytes(Charset.defaultCharset()),
                Charset.defaultCharset());

        // referential equality
        System.out.println(String.format("a == b: %b", a == b));

        // structural equality
        System.out.println(String.format("a.equals(b): %b", a.equals(b)));
    }
}
