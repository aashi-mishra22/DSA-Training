import java.util.*;

public class Rowsum {

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

        int[] result = rowSum(arr);

        System.out.println("Sum of each row:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] rowSum(int[][] arr) {

        int R = arr.length;

        int[] result = new int[R];

        for (int i = 0; i < R; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }

            result[i] = sum;
        }

        return result;
    }
}
