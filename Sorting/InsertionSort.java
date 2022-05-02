import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array");
            int m = sc.nextInt();

            System.out.println("Please enter the array to be sorted");
            int a[] = new int[m];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            // time complexity = O(n^2)
            for (int i = 1; i < a.length; i++) {
                int cur = a[i];
                int j = i - 1;
                while (j >= 0 && cur < a[j]) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = cur;
            }
            System.out.println("Sorted Array is :");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
