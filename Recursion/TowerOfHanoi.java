package Recursion;

import java.util.*;

public class TowerOfHanoi {
    public static void towerofhanoi(int n, String src, String helper, String destination) {

        if (n == 1) {
            System.out.println("transfering disk " + n + " from " + src + " to " + destination);
            return;
        }
        towerofhanoi(n - 1, src, destination, helper);
        System.out.println("transfering disk " + n + " from " + src + " to " + destination);
        towerofhanoi(n - 1, helper, src, destination);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no of disk to be transfered");
            int n = sc.nextInt();
            // time complexity = O(2^n)
            towerofhanoi(n, "S", "H", "D");
            int totalSteps=(int) (Math.pow(2, n)-1);
            System.out.println("total no of steps used : "+totalSteps);
        }
    }
}