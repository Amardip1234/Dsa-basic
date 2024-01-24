package Arrays;

import java.util.Scanner;

public class ArrayPractise {
    static int targetSum(int []arr,int x){
        int count =0;
        for (int i = 0;i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void oddEven(int arr[]){
        int n = arr.length;
        int left = 0 , right = n-1;

        while (left<right){
            if (arr[left]%2==1 && arr[right]%2==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2==1){
                right--;
            }
        }

    }


    static void inPlaceReverse(int arr[],int left,int right){
        while (left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    static void inPlacerotateArray(int arr[],int k){
        int n= arr.length;
        k = k%n;
        inPlaceReverse(arr , 0,n-k-1);
        inPlaceReverse(arr,n-k,n-1);
        inPlaceReverse(arr,0,n-1);
    }

    static void printmultArray(int arr[][], int r1, int c1){
        for (int i = 0 ; i<r1; i++){
            for (int j = 0; j<c1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void add2DArray(int a[][], int r1, int c1,int b[][], int r2, int c2){
        if (r1!=r2 || c2!=c1){

        }
        int sum[][] = new int[r1][c1];
        for (int i = 0 ; i< r2; i++){
            for (int j = 0; j<c2; j++){
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition of array is");
        printmultArray(sum,r1,c1);
    }
    static void multiply(int a[][], int r1, int c1,int b[][], int r2, int c2){
        if (c1!=r2){
            System.out.println("Invalid Dimensions Provided");
            return ;
        }

        int mul[][]= new int[r1][c2];
        for (int i =0; i<r1; i++){
            for (int j = 0; j<c2; j++){
                for (int k =0; k<c1; k++){
                    mul[i][j]+= a[i][k]*b[k][j];
                }
            }
        }
        printmultArray(mul,r1,c2);
    }


    static int[][] transpose(int arr[][], int r, int c){
        for (int i=0; i<c;i++){
            for (int j= i; j<r; j++){
                int temp =arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
            return arr;
    }


    static int[] reverse(int arr[]){
        int left = 0; int right = arr.length-1;
        while (left<right){
            int temp  =arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    static void rotate(int a[][], int r, int c){
       int ans[][] = transpose(a,r,c);

       for (int i =0; i<r; i++){
           reverse(ans[i]);

       }
    }


    static int[][] pascal( int n){
        int ans[][] = new int[n][];

        for (int i =0; i<n;i++){
            ans[i] =new int[i+1];

            ans[i][0] = ans[i][i] = 1;

            for (int j=1;j<i; j++){
                ans[i][j] = ans[i-1][j-1]+ans[i-1][j];
            }
        }return ans;
    }

    static void printArray(int arr[][]){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }


    static int missingNumber(int[] nums) {
        int left = 0;
        int ans = 0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left]>nums[right]){
                int temp = nums[left];
                nums[left]= nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        for(int i = 0; i<right; i++){
            if(nums[i]!=ans++){
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int ans[] = {3,0,1};
        System.out.println(missingNumber(ans));

        Scanner sc = new Scanner(System.in);
//        int arr[] = {1,4,7,5,8,2};
//       int count =  targetSum(arr,12);
//        System.out.println(count);


//        for (int i =0; i<4; i++){
//            for (int j=0; j<5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i =1; i<5; i++){
//            for (int j = 4; j>i; j--){
//                System.out.print(" ");
//            }
//            for (int k = 1; k<=i; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        int arr[] = {1,2,3,4,5};
//        oddEven(arr);
//        printArray(arr);

//        int arr[]= {1,2,3,4,5};
//        inPlaceReverse(arr);
//        printArray(arr);

//        int arr[]= {1,2,3,4,5,6,7};
//        inPlacerotateArray(arr,9);
//        printArray(arr);

//        System.out.println("number of rows for matrix 1");
//        int r1 = sc.nextInt();
//        System.out.println("number of columns for matrix 1");
//        int c1 = sc.nextInt();
//        int a[][] = new int [r1][c1];
//        System.out.println("Enter values");
//        for (int i = 0 ; i< r1; i++){
//            for (int j = 0; j<c1; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        printmultArray(a,r1,c1);


//        System.out.println("number of rows for matrix 2");
//        int r2 = sc.nextInt();
//        System.out.println("number of columns for matrix 2");
//        int c2 = sc.nextInt();
//        int b[][] = new int [r2][c2];
//        System.out.println("Enter values");
//        for (int i = 0 ; i< r2; i++){
//            for (int j = 0; j<c2; j++){
//                b[i][j] = sc.nextInt();
//            }
//        }
//        printmultArray(b,r2,c2);
//
//        multiply(a,r1,c1,b,r2,c2);

//        add2DArray(a,r1,c1,b,r2,c2);


//         int ans[][] = transpose(a,r1,c1);
//        System.out.println("Transpose Array");
//        printmultArray(ans,r1,c1);


//        rotate(a,r1,c1);
//        printmultArray(a,r1,c1);


//        int n = sc.nextInt();
//
//        int ans[][] = pascal(n);
//        printArray(ans);
    }
}


