package Arrays;

import java.util.Scanner;

public class MultDimArray {

    static void printArray(int arr[][]){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }


    static int[][] adArray(int arr[][],int[][]arr2, int r1, int c1, int r2, int c2){
         if (r1 != r2 || c1 != c2){
             System.out.println("wrong input metrix");
              ;
         }
         int sumArray[][] = new int [r1][c1];

         for (int i = 0; i<r1; i++){
             for (int j = 0; j<c1; j++){
                 sumArray[i][j] = arr[i][j] + arr2[i][j];
             }
         }
         return sumArray;
    }

    static void mul(int a[][], int r1, int c1, int r2, int c2){
        if (c1 != r2){
            System.out.println("multiplication cannot be applied");
            return ;
        }
        for (int i = 0; i<r1;i++){
            for (int j = 0; j<c1; j++){

            }
        }
    }


    static void multiply(int[][]a,int r1,int c1, int[][]b, int r2, int c2){
        if (r1 != c2){
            System.out.println("Invalid Dimensions");
            return;
        }

        int mul[][] = new int[r1][c2];
        for (int i =0; i<r1; i++){
            for (int j = 0; j<c2; j++){
                for (int k =0; k<c1; k++){
                    mul[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        printArray(mul);
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

//        System.out.println("Enter rows for matrix 2");
//        int r2 = sc.nextInt();
//        System.out.println("Enter Columns");
//        int c2 = sc.nextInt();
//        int arr2[][] = new int[r2][c2];
//        System.out.println("Enter values");
//        for (int i= 0; i<r2;i++){
//            for (int j = 0; j<c2; j++){
//                arr2[i][j] = sc.nextInt();
//            }
//        }
//        printArray(arr2);
//       int sum[][] = adArray(arr,arr2,r1,c1,r2,c2);
//        printArray(sum);

//        multiply(arr,r1,c1,arr2,r2,c2);



    }
}
