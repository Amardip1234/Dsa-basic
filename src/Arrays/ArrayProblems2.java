package Arrays;

import java.util.Scanner;

public class ArrayProblems2 {

    static void printArray(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] reverseArray(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int j =0;

        for (int i = n-1; i>=0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }


    static void swapInArray(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void inPlaceReverse(int []arr, int j, int k){

//        for (int i =0; i<arr.length; i++){
//            temp = arr[j] ;
//            arr[j] = arr[k];
//            arr[k] = temp;
//            j++;
//            k--;
//            if (j>k){
//                return arr;
//            }
//        }
//        return arr;

        while (j<k){
            swapInArray(arr,j,k);
            j++;
            k--;
        }
    }


    static int[] rotate(int []arr, int k){
        int n = arr.length;
        k = k%n;
        int j =0;
        int ans[] = new int[n];
        for (int i = n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for (int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }


    static void rotateInPlace(int arr[], int k){
        int n = arr.length;
        k = k%n;
        inPlaceReverse(arr, 0,n-k-1);
        inPlaceReverse(arr,n-k,n-1);
        inPlaceReverse(arr,0,n-1);
    }


    static int[] freqArray(int arr[]){
        int freq[] = new int[100005];

        for (int i =0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
//        reverseArray(arr);
//        printArray(reverseArray(arr));

//        inPlaceReverse(arr);
//        printArray(arr);
//        System.out.println("Before rotate");
//        printArray(arr);
//        System.out.println("After Rotate");
//        int ans[] = rotate(arr,51);
//        printArray(ans);

//        int arr3[] = {1,2,3,4,5,6,7};
//        rotateInPlace(arr3,101);
//
//        printArray(arr3);

        int arr2[]= {1,2,3,4,5};
        int freq[] = freqArray(arr2);

        System.out.println("Enter no. of queries");
        int q = sc.nextInt();
        printArray(arr);
        while (q>0){
            System.out.println("Enter your Query");
            int x = sc.nextInt();
            if (freq[x]>0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            q--;
        }
    }
}
