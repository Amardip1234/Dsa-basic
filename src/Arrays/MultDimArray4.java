package Arrays;

import java.util.Scanner;

public class MultDimArray4 {
    
    static void printarray( int [][]matrix , int r, int c){
        for (int i= 0; i<r;i++){
            for (int j = 0; j<c; j++){
                System.out.print(matrix[i][j] + " ") ;
            }
            System.out.println();
        }
    }
//    static void findPrefixSum(int arr[][]){
//        int r = arr.length;
//        int c = arr[0].length;
//        for (int i = 0; i<r; i++){
//            for (int j =1; j<c; j++){
//                arr[i][j]+= arr[i][j-1];
//            }
//        }
//    }

//    static int findSum(int matrix[][], int l1, int r1, int l2, int r2){
//        int sum = 0;
//        findPrefixSum(matrix);
//        for (int i = l1; i<=l2;i++){
//            if (r1>=1){
//                sum+= matrix[i][r2] - matrix[i][r1-1];
//            }else {
//                sum+= matrix[i][r2];
//            }
//        }
//        return sum;
//    }

    static void prefixSum(int [][]matrix){
        int r = matrix.length;
        int c = matrix[0].length;

//        prefix of row-wise
        for (int i = 0; i<r; i++){
            for (int j =1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

//        prefix of col-wise
        for (int i =0;i<c; i++){
            for (int j =1; j<r; j++){
                matrix[j][i]+=matrix[j-1][i];
            }
        }
    }

//    static void PrefixCol(int matrix[][]){
//        int r = matrix[0].length;
//        int c = matrix.length;
//    }
    static int findSumMatrix(int matrix[][], int l1, int r1, int l2, int r2){
        prefixSum(matrix);
        int sum = 0;
        for (int i = l1; i<=l2; i++){
            if (r1>=1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }else {
                sum += matrix[i][r2] ;
            }
        }
        return sum;
    }


    static int findSum3(int matrix[][], int l1, int r1, int l2, int r2){
//        ans = sum - top -left + leftup
        prefixSum(matrix);
        int ans = 0, sum = 0, top = 0, left = 0, leftUp = 0;

        sum = matrix[l2][r2];
        if (l1>=1){
            top = matrix[l1-1][r2];
        }
        if (r1>=1){
            left = matrix[l2][r1-1];
        }
       if (l1>=1 && r1>=1){
           leftUp = matrix[l1-1][r1-1];
       }


        ans = sum - top -left +leftUp;



        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows for matrix 1");
        int r = sc.nextInt();
        System.out.println("Enter Columns");
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Enter values");
        for (int i= 0; i<r;i++){
            for (int j = 0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter boundaries l1 r1 l2 r1");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

//       int sum = findSumMatrix(matrix, l1,r1,l2,r2);
//        System.out.println(sum);
//       int sum=  findSum(matrix,l1,r1,l2,r2);
//        System.out.println(sum);

        System.out.println(findSum3(matrix,l1,r1,l2,r2));


        




    }
}
