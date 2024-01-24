package Arrays;

public class ArrayProbblems {

    static int targetSum(int arr[], int x){
        int ans = 0;
        for (int i =0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==x){
                    ans++;
                }
            }
        }
        return ans;
    }

    static int tripletSum(int arr[], int target){
        int ans =0;
        for (int i =0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                for (int k =j+1; k<arr.length; k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }



    static int unicVal(int arr[]){
        int ans = -1;
        for (int i=0; i<arr.length; i++){
            for (int j =i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i]> ans){
                ans = arr[i];
            }
        }
        return ans;
    }


    static int max(int arr[]){
        int mx = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondmax(int arr[]){
        int mx = max(arr);

        for (int i= 0; i<arr.length; i++){
            if (arr[i]==mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = max(arr);
        return secondMax;
    }


    static int firstRepeatVal(int arr[]){
        int ans =-1;
        for (int i=0;i<arr.length; i++){
            for (int j = i+1; j <arr.length; j++){
                if (arr[i]==arr[j]){
                    return  arr[i];
                }
            }
        }
        return -1;
    }


    static int secondSmalles(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    static int findSecondSmallest(int arr[]){
        int min = secondSmalles(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }

        int secondSmall = secondSmalles(arr);
        return secondSmall;
    }


    static void swap(int a, int b){
        System.out.println("original nums :");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        int temp;
        temp = a;
        a=b;
        b=temp;

        System.out.println("original nums after changing:");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }


    static void swapWithoutTemp(int a,int b){
        System.out.println("before");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        a = a+b;
        b = a-b;
        a= a-b;

        System.out.println("After");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
    }


    public static void main(String[] args) {
//        int arr[] = {4,6,3,5,8,2};
//        int arr2[] = {1,4,5,6,3};
//        System.out.println(targetSum(arr,7));
//        System.out.println(tripletSum(arr2,8));

//        int arr3[] = {1,2,3,4,3,2,1};
//        System.out.println(unicVal(arr3));

//        System.out.println(findSecondmax(arr));

//        int arr4[] ={1,5,3,4,6,3,4,-2,-1};
//        System.out.println(firstRepeatVal(arr4));
//        System.out.println(findSecondSmallest(arr4));

//        swap(2,4);
//        swapWithoutTemp(2,5);


    }
}
