import java.util.*;
public class waveform {
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

        System.out.println("Column-wise Waveform:");

        for (int j = 0; j < C; j++) {

            if (j % 2 == 0) {
                // Top to Bottom
                for (int i = 0; i < R; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } 
            else {
                // Bottom to Top
                for (int i = R - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
