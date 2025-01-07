/* The ? Operator
If expression1 is true, then expression2 is evaluated, otherwise, expression3 is evaluated.
*/
public class TerneryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int result = (x > y) ? x : y;
        System.out.println(result);
    }
}