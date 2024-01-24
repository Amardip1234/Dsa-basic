package Arrays;

import java.util.Scanner;

public class MultDimArray3 {

    static int[][]pascals( int n){
        int ans[][] = new int[n][];
        for (int i = 0;i<n; i++){
            ans[i] = new int[i+1];

            ans[i][0] = ans[i][i] =1;

            for (int j =1; j<i; j++){
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
        }
        return ans;
    }

    static void printArray(int arr[][]){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void Spiralmatrix(int arr[][] , int r, int c){
        int totalElements = 0;
        int leftCol = 0;
        int toprow = 0;
        int rightCol = c-1;
        int bottomrow =  r-1;

        while (totalElements< r*c){
//            toprow
            for (int i = leftCol; i<=rightCol; i++){
                System.out.print(arr[toprow][i]+" ");
                totalElements++;
            }
            toprow++;

//            rightcolo
            for (int i =toprow; i<=bottomrow;i++){
                System.out.print(arr[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
//            bottom
            for (int i = rightCol; i>=leftCol; i--){
                System.out.print(arr[bottomrow][i] + " ");
                totalElements++;
            }
            bottomrow--;
//              leftrow
            for (int i = bottomrow; i>=toprow; i--){
                System.out.print(arr[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }

    static int[][] generateMatrix(int n) {
        int curr = 1;
        int leftCol = 0;
        int toprow = 0;
        int rightCol = n - 1;
        int bottomrow = n- 1;

        int[][]matrix = new int[n][n];
        while (curr <= n * n) {
//            toprow
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[toprow][i] = curr++;
            }
            toprow++;

//            rightcolo
            for (int i = toprow; i <= bottomrow; i++) {
                matrix[i][rightCol] = curr++;
            }
            rightCol--;
//            bottom
            for (int i = rightCol; i >= leftCol; i--) {
                matrix[bottomrow][i]= curr++;
            }
            bottomrow--;
//              leftrow
            for (int i = bottomrow; i >= toprow; i--) {
                matrix[i][leftCol]= curr++;
            }
            leftCol++;
        }
        return matrix;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rows for matrix 1");
//        int r1 = sc.nextInt();
//        System.out.println("Enter Columns");
//        int c1 = sc.nextInt();
//        int arr[][] = new int[r1][c1];
//        System.out.println("Enter values");
//        for (int i= 0; i<r1;i++){
//            for (int j = 0; j<c1; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        printArray(arr);
//
//        System.out.println("spiralprint");
//        Spiralmatrix(arr,r1,c1);

        int n = sc.nextInt();
        int[][]matrix = generateMatrix(n);
        printArray(matrix);

    }
}
