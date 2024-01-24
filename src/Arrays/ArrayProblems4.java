package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class ArrayProblems4 {

    static void printArray(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int [] makePreficSum(int arr[]){
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    static int[] inPlacePrefixSum(int arr[]){
        int n = arr.length;
        for (int i =1;i<n;i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }


    static int arraySum(int arr[]){
        int totalSum =0;
        for (int i =0;i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int []arr){
        int totalSum = arraySum(arr);
        int prefSum = 0;
        for (int i =0; i<arr.length; i++){
            prefSum += arr[i];
            int suffixSum = totalSum-prefSum;
            if (prefSum == suffixSum){
                return true;
            }
        }
        return false;
    }


    static int [] suffixSum(int arr[]){
        int n = arr.length;
        for (int i = n-2; i>=0; i--){
            arr[i] = arr[i+1]+arr[i];
        }
        return arr;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
//        System.out.println("Original Array");
//        printArray(arr);
//        int prefix[] = makePreficSum(arr);
//        printArray(prefix);

//        inPlacePrefixSum(arr);
//        printArray(arr);

//

//        int pref[]=inPlacePrefixSum(arr);
//        printArray(arr);
//
//        System.out.println("Enter number of queries");
//        int q = sc.nextInt();
//        while (q-->0){
//            System.out.println("Enter range");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans = pref[r-1]-pref[l-2];
//            System.out.println("sum "+ans);
//        }

        int arr2[] = {3,2,5,1};

//         boolean ans = equalSumPartition(arr2);
//        System.out.println(ans);
        int ans[] = suffixSum(arr2);
        printArray(ans);




    }
}
