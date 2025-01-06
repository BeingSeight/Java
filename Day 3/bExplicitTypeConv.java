// Write a program to demonstrate explicit type casting in java.
public class bExplicitTypeConv {
    public static void main(String[] args) {
        double d = 100.23;
        // Explicit Type Casting :trucation,
        long l = (long) d;
        // Explicit Type Casting
       int i = (int) l;
        System.out.println("Double value " + d);
        System.out.println("Long value " + l);
        System.out.println("Int value " + i);
    }
}