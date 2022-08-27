package javakotlinworkshop.java;

public class DataTypes {

    public static void main(String[] args) {
        float a = 123.45f;
        double b = 123.45;
        long c = 1;
        int d = 2;
        short e = 3;
        byte f = 4;
        var g = true;
        printClassName(a);
        printClassName(b);
        printClassName(c);
        printClassName(d);
        printClassName(e);
        printClassName(f);
        printClassName(g);
    }

    private static void printClassName(Object n) {
        System.out.println(n.getClass().getName());
    }
}
