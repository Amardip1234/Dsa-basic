package Arrays;

import java.util.Scanner;



public class MultDimArray2 {
    static void printArray(int arr[][]){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void transposeArray(int a[][], int r, int c){
        int [][]ans = new int[c][r];

        for (int i = 0; i<c; i++){
            for (int j =0; j<r; j++){
                ans[i][j] = a[j][i];
            }
        }
        printArray(ans);
    }

    static void transposeInPlace(int a[][], int r, int c){
        for (int i = 0; i<c; i++){
            for (int j =0; j<r; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

//    static void reverse2dArray(int []arr,int r,int c){
//        int n = arr.length;
//        for (int i =0; i<r;i++){
//            for (int j = 0; j<c;j++){
//                arr[i][j] = arr[n-1]
//            }
//        }
//    }

    static void transpose(int a[][], int r,int c){
        for (int i = 0; i<c; i++){
            for (int j =i; j<r; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }


    static void reverseArray(int arr[]){
        int left = 0; int right= arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }


    static void rotate(int arr[][],int n){
        transpose(arr,n,n);

        for (int i =0; i<n; i++){
            reverseArray(arr[i ]);
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows for matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter Columns");
        int c1 = sc.nextInt();
        int arr[][] = new int[r1][c1];
        System.out.println("Enter values");
        for (int i= 0; i<r1;i++){
            for (int j = 0; j<c1; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
//        System.out.println("Transpose Of array");
//        transposeArray(arr,r1,c1);

//        transpose(arr,r1,c1);
//        printArray(arr);

        System.out.println("rotate of array");
        rotate(arr,r1);



//        System.out.println(arr2.length);


    }
}
