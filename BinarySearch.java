import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
