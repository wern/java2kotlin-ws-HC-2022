package javakotlinworkshop.java;

import java.util.Objects;

public class NullSafety {

    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.length());

        String stringThatCanBeNull = null;
        try {
            // causes java.lang.NullPointerException
            System.out.println(stringThatCanBeNull.length());
        } catch (NullPointerException e) {
            System.out.println("Crash");
        }

        // Ternary Operator In Java
        var l1 = stringThatCanBeNull != null
                ? stringThatCanBeNull.length()
                : -1;
        System.out.println(l1);

        // since Java 9
        var safeString = Objects.requireNonNullElse(stringThatCanBeNull, new String());
        System.out.println(safeString.length());
    }
}
