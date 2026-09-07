import java.util.*;
public class RC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking rows and columns
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        // Creating 2D array
        int[][] arr = new int[r][c];

        // Taking input
        System.out.println("Enter array elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing array
        System.out.println("2D Array is:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}