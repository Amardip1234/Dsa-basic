package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class ArrayExamples{
    void demoArrays(){
       int[] ages = new int[6];
       ages[0] = 1;
       ages[1] = 23;
       ages[2] = 84;
       ages[3] = 66;
       ages[4] = 55;
       ages[5] = 25;
//        for (int i = 0; i<=5; i++){
//            System.out.println(ages[i]);
//        }

//        for each loop
//        for (int age : ages) {
//            System.out.println(age);
//        }

//        int multidimArray[][] = {{12,21,54},{2,54,65}};
//
//        for (int i =0; i<multidimArray.length; i++){
//            for (int j = 0; j<multidimArray[i].length; j++){
//                System.out.print(multidimArray[i][j]);
//            }
//            System.out.println();
//        }


//        calculate sum of all elementss

            int arr[] = {1, 5, 3, 99};
            int ans = 0;
//        for (int i = 0; i<arr.length; i++){
//            ans +=arr[i];
//        }
            System.out.println(ans);
    }


//     calculating max of array
    void maxOfArray(){
        int ans = 0;

        int arr1[] = {1,55,32};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > ans) {
                ans = arr1[i];
            }
        }
        System.out.println(ans);
    }


//    searching x element

    int arr[] = {1,7,1,4,3};
    int x =1;
    int ans = -1;
    void searchingX(){
        for (int i = 0; i<arr.length; i++) {
            if (x == arr[i]) {
                ans = i;
                break;
            }
        }
        System.out.println("found "+x+" at index "+ ans);
        }


    }


public class main {
    static void printarray(int arr[]){
        for (int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    static int freqOccurence(int arr[], int x){
        int freq =0;
        for (int i =0; i<arr.length; i++){
            if (arr[i] == x){
                freq++;
            }
        }
        return freq;
    }

    static int lastOccurence(int arr[],int x){
        int lastOccurence = -1;
        for (int i =0; i<arr.length;i++){
            if (arr[i]==x){
                lastOccurence= i;
            }
        }
        return lastOccurence;
    }
    static int greaterElement(int arr[], int x){
        int count = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i]>x){
                count++;
            }
        }
        return count;
    }

    static boolean isSorted(int arr[]){
        boolean check = true;
        for (int i = 1; i<arr.length; i++){
            if (arr[i]<arr[i-1]){
                check = false;
                break;
            }

        }
        return check;
    }

    static int[] smallBigArray(int arr[]){
        int small = 100;
        int big =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>big){
                big = arr[i];
            }
            if (arr[i]<small){
                small = arr[i];
            }
        }
        int newArray[] = {small,big};
//        int newArr[] = {small,big};
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayExamples obj = new ArrayExamples();
//        obj.demoArrays();
//        obj.maxOfArray();
//        obj.searchingX();



//        int arr[] = new int[5];
//
//        for (int i =0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }


//        int arr[] = {5,6,7,8,9};
//        printarray(arr);
//        int arr2[] = arr.clone();
//        System.out.println( "Coppied array");
//        printarray(arr2);
//
//        arr2[0] = 0;
//        arr2[1] = 2;
//        System.out.println("original arr after changing value");
//        printarray(arr);
//        System.out.println("original arr2 after changing value");
//        printarray(arr2);

        int arr[] = {5,6,5,1,5,5};
        int arr2[] ={1,2,3,4,5};
        int arr3[] = {5,8,1,3,6,2,10};
//        System.out.println(freqOccurence(arr,5));
//        System.out.println(lastOccurence(arr,44));
//        System.out.println(greaterElement(arr, 2));
//        System.out.println(isSorted(arr2));
        printarray(smallBigArray(arr3));


    }
}
