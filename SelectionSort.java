import java.util.*;

public class SelectionSort {
    
    static void selection(int a[], int n) {
        int i, j;
        for (i = 0; i <= n - 2; i++) {
            for (j = i + 1; j <= n - 1; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The sorted elements:");
        for (i = 0; i < n; i++)
            System.out.println(a[i]);
    }

    public static void main(String[] args) {
        int a[] = new int[100], i, n;
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = s1.nextInt();

        System.out.println("Enter unsorted elements:");
        for (i = 0; i < n; i++) {
            a[i] = s1.nextInt();    
        }
        
        selection(a, n);
    }
}
