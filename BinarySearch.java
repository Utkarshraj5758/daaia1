import java.util.*;

public class BinarySearch {
    
    static int binary(int[] a, int low, int high, int key) {
        int mid;
        if (low > high) {
            return -1; // Key not found
        } else {
            mid = (low + high) / 2;
            if (key == a[mid])
                return mid + 1; // Return 1-based index
            else if (key > a[mid])
                return binary(a, mid + 1, high, key); // Search right half
            else
                return binary(a, low, mid - 1, key); // Search left half
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10000];
        Random rand = new Random();

        // Generating random numbers from 1 to 10000
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10000) + 1; // Generates numbers between 1 and 10000
        }

        // Sorting the array (Binary Search needs sorted input)
        Arrays.sort(a);

        // Taking key input from user
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the key element to search:");
        int key = s1.nextInt();

        // Measuring execution time
        long startTime = System.currentTimeMillis();
        int x = binary(a, 0, a.length - 1, key);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        if (x == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + x);
        }

        System.out.println("Execution time: " + totalTime + " milliseconds");
    }
}
