package Recursion;

public class Recursion4 {
    static boolean isSorted(int ar[], int indx){
        if (ar.length-1 == indx)return true;

        if (ar[indx]>ar[indx+1])return false;
        return isSorted(ar,indx+1);
    }

    static int lastindex(int ar[],int indx, int target){
        if (indx<0){
            return indx;
        }

        if (ar[indx]==target){
            return indx;
        }
       return lastindex(ar,indx-1,target);
    }
    public static void main(String[] args) {
        int ar[] ={10,2,3,2,4,5,1};
//        int length = ar.length-1;
//        if (isSorted(ar,0)){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }

        System.out.println(lastindex(ar,ar.length-1,1));
    }
}
