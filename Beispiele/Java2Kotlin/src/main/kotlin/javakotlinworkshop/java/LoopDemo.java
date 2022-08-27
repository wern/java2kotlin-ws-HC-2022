package javakotlinworkshop.java;

import java.util.Arrays;

public class LoopDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        for (int i = 6; i >= 0; i -= 2) {
            System.out.println(i);
        }

        var array = new String[]{"Eins", "Zwei", "Drei"};
        for (var s : array) {
            System.out.println(s);
        }

        var list = Arrays.asList("Eins", "Zwei", "Drei");
        list.forEach(s -> System.out.println(s));

        int i = 0;
        while (i++ < 3) {
            System.out.println(i);
        }
    }
}
