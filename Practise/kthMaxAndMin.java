package Practise;

import java.util.ArrayList;
import java.util.Collections;

public class kthMaxAndMin {
    public static void main(String[] args) {
        int k=4;
        int arr[]={8,2,9,4,6,1,7,3,0,5,10};
        int min=minimum(arr,k);
        int max=max(arr,k);
        System.out.println(k+" min is : "+min);
        System.out.println(k+" max is : "+max);
    }

    private static int minimum(int[] arr,int k) {
        int min=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        for(int j=0;j<list.size();j++){
            if(j==k-1){
                min=list.get(j);
            }
        }
        return min;
    }

    private static int max(int[] arr,int k) {
        int max=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        for(int j=list.size()-1;j>=0;j--){
            if(j==list.size()-k){
                max=list.get(j);
            }
        }
        return max;
    }
}
