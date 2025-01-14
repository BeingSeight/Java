// write a program to find sum of elements of an array for a given array.

public class bArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements of array is: " + sum);
    }
}