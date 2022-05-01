import java.util.*;

class BubbleSort {

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
            for (int i = a.length - 1; i >= 0; i--) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        // swap
                        int temp = a[j + 1];
                        a[j + 1] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.println("Sorted Array is :");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}