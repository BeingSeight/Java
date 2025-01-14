// Jagged arrays are arrays can have different rows and different columns in each row.
// In this program, we will create a jagged array and print the elements of the jagged array.

public class dJaggedArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9, 10, 11, 12}
        };
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}