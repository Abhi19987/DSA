package Practise;

public class ArrayReverse {
    public static int[] reverse(int a[]){
        int size=a.length;
        for(int i=0;i<size/2;i++){
            int temp=a[i];
            a[i]=a[size-i-1];
            a[size-i-1]=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        arr=reverse(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
