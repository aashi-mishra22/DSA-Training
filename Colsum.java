import java.util.*;

public class Colsum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int R = sc.nextInt();

        System.out.print("Enter columns: ");
        int C = sc.nextInt();

        int[][] arr = new int[R][C];

        System.out.println("Enter matrix:");

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter column number: ");
        int col = sc.nextInt();

        int ans = colSum(arr, col);

        System.out.println("Sum of column = " + ans);
    }

    public static int colSum(int[][] arr, int col) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][col];
        }

        return sum;
    }
}
