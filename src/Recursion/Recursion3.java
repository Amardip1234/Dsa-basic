package Recursion;

import java.util.ArrayList;

public class Recursion3 {
    static void printArray(int arr[], int indx){
        if (indx == arr.length) return;
        System.out.print(arr[indx]);
        printArray(arr, indx+1);
    }

    static int max(int arr[], int indx){

        if (indx==arr.length-1)return arr[indx];

        int max = max(arr,indx+1);
        return Math.max(max,arr[indx]);
    }


    static int sumArray(int arr[], int indx){
        if (indx == arr.length-1){
            return arr[indx];
        }
        int sum = sumArray(arr, indx+1);
        return arr[indx] + sum;
    }


    static boolean checkVal(int arr[], int indx, int x){
        if (indx >= arr.length)return false;

        if (arr[indx] ==x)return true;

        return checkVal(arr,indx+1, x);
    }


    static int searchIndex(int arr[], int indx, int x){
        if (indx >= arr.length)return -1;

        if (arr[indx] == x)return indx;

      return (searchIndex(arr,indx+1,x));
    }


    static void findAllIndices(int arr[],int indx, int x){
        if (indx>=arr.length)return ;

        if (arr[indx] == x){
            System.out.println(indx);
        }
        findAllIndices(arr,indx+1,x);
    }


    static ArrayList<Integer>allIndices(int arr[], int indx, int x){
        ArrayList<Integer>ans = new ArrayList<>();
        if(indx>=arr.length){
            return ans;
        }

        if (arr[indx] == x){
            ans.add(indx);
        }
        ArrayList<Integer>smalAns = allIndices(arr,indx+1,x);

        ans.addAll(smalAns);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10,3,5};
//        printArray(arr,0);
//        System.out.println(max(arr,0));
//        System.out.println(sumArray(arr, 0));

//        if (checkVal(arr,0,50)){
//            System.out.println("Yes");
//        }else {
//            System.out.println("NO");
//        }

//        System.out.println(searchIndex(arr, 0,3));

//        System.out.println(searchIndex(arr,0,5));

        int arr2[] = {10,2,3,5,2,2,1};

//        findAllIndices(arr2, 0, 2);

        ArrayList<Integer>list = allIndices(arr2, 0,2);
        for (Integer i: list){
            System.out.println(i);
        }

    }
}
