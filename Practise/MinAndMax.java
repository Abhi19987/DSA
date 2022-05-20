package Practise;


public class MinAndMax {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int min=minimum(arr);
        int max=max(arr);
        System.out.println("min : "+ min);
        System.out.println("max : "+ max);
    }

    private static int minimum(int[] arr) {
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }

    private static int max(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}
