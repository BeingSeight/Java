/* The ? Operator
If expression1 is true, then expression2 is evaluated, otherwise, expression3 is evaluated
here in this eg. (x > y) is expression1, x is expression2 and y is expression3
*/
public class aTerneryOperator {
    public static void main(String[] args) {
        int x = 8;
        int y = 16;
        int result = (x > y) ? x : y;
        System.out.println(result);
    }
}