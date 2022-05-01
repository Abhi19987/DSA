import java.util.*;

public class SelectionSort {
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
            for (int i = 0; i < a.length; i++) {
                int min=i;
                for (int j = i+1; j < a.length; j++) {
                    if(a[min]>a[j])
                    {
                        min=j;
                    }
                }
                //swap
                if(min!=i)
                {
                    int temp=a[i];
                    a[i]=a[min];
                    a[min]=temp;
                }
            }
            System.out.println("Sorted Array is :");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
