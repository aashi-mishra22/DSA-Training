import java.util.*;

public class Transpose {

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

        int[][] result = transpose(arr);

        System.out.println("Transpose:");

        printMatrix(result);
    }

    public static int[][] transpose(int[][] arr) {

        int R = arr.length;
        int C = arr[0].length;

        // Rows and columns are swapped
        int[][] result = new int[C][R];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {

                result[j][i] = arr[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
