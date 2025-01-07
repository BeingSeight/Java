// WAP for accepting single character, int, float, string and double value from the keyboard

import java.util.Scanner;
public class cUserInput1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        char ch = in.next().charAt(0);
        System.out.println("The character is " + ch);
        System.out.println("Enter an integer: ");
        int num = in.nextInt();
        System.out.println("The integer is " + num);
        System.out.println("Enter a float: ");
        float f = in.nextFloat();
        System.out.println("The float is " + f);
        System.out.println("Enter a string: ");
        String str = in.next();
        System.out.println("The string is " + str);
        System.out.println("Enter a double: ");
        double d = in.nextDouble();
        System.out.println("The double is " + d);
        in.close();
    }
}