package Practise;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arr[]={-3,2,5,0,-2,-4,-8,9};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
