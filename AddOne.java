import java.util.*;

public class AddOne {

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

        addOne(arr);

        System.out.println("Matrix after adding 1:");

        printMatrix(arr);
    }

    public static void addOne(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = arr[i][j] + 1;
            }
        }
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