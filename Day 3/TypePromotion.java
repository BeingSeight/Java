public class TypePromotion {
    public static void main(String[] args) {
        byte b = 50;
        // Error: cannot convert from int to byte
        // b = b * 2;
        // Correct way:
        b = (byte) (b * 2);
        System.out.println(b);
    }
}
