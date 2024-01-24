package Arrays;

public class ArrayProblems3 {

    static void printArray(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void sortZeroesAndOnes(int arr[]){
        int n = arr.length;
        int zeroes= 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i]==0){
                zeroes++;
            }
        }

        for (int i=0; i<n; i++){
            if (i<zeroes){
                arr[i] =0;
            }else {
                arr[i] =1;
            }
        }
    }


    static void swapInArray(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortZeroOnesbyTwoPointer(int arr[]) {
        int n = arr.length;
        int left =0,right=n-1;

        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
    }


    static void oddEven(int []arr){
        int n = arr.length;
        int left = 0 , right =n-1;
        while (left<right){
            if (arr[left]%2==1 && arr[right]%2==0){
                swapInArray(arr,left,right);
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

    static int[] sortngNonDecreasing(int arr[]){
        int n = arr.length;
        int left = 0 ,right = n-1 , j = 0;
        int ans[] = new int[n];
        while (left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[j++] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[j++] = arr[right] * arr[right];
                right--;
            }
        }return ans;
    }



    public static void main(String[] args) {

//        int arr[] = {0,1,0,1,0,1,1,0,1};
//        sortZeroesAndOnes(arr);
//        printArray(arr);

        int arr2[] = {0,1,1,0,1,0,1,0,0};
//        System.out.println("before");
//        printArray(arr2);
//
//        int arr3[]= {1,0,0,1,0,1,0,0,0,1};
//        System.out.println("before changing");
//        printArray(arr3);
//        sortZeroOnesbyTwoPointer(arr3);
//        System.out.println("after changing");
//        printArray(arr3);

//        int odeven[] = {1,2,3,4,5};
//        oddEven(odeven);
//        printArray(odeven);

        int arr4[] = {-10,9,4,-8,5};
        System.out.println("original Array");
        printArray(arr4);
        System.out.println("Sorted Array");
        int ans[] = sortngNonDecreasing(arr4);
        printArray(ans);
    }
}
