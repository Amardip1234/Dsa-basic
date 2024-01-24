package Recursion;

public class Recursion2 {
    static void kthMultiple(int n, int k){
        if (k==1){
            System.out.println(n*k);
            return;
        }
         kthMultiple(n,k-1);
        System.out.println(n*k);
    }

    static int alternateSum(int n){
        if (n==1) return 1;

        int sum = alternateSum(n-1);
        if (n%2==0){
            return sum - n;
        }else {
            return sum + n;
        }

    }


    static int[] gcd(int a , int b){
        int ans[] = new int[a];
        int val =0;
        for (int i = a; i>=1;i--){

            if (a%i ==0 && b%i==0){
                ans[val++] += i;
            }
        }
        return ans ;
    }

    static int iGCD(int x, int y){
        while (x%y != 0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }


    static int GCD(int x, int y){
        if (y==0){
            return x;
        }
        return GCD(y,x%y);
    }


    static int armstrong(int n){
        if (n==0){
            return n;
        }
        int arm = armstrong(n/10);
        return  arm + n;
    }
    public static void main(String[] args) {
//        kthMultiple(6,4);
//        System.out.println(alternateSum(4));
//        System.out.println(gcd(12,16));
//        int ans[] = gcd(12,16);
//        for (int i=0; i<ans.length;i++){
//            System.out.print(ans[i]);
//        }

//        System.out.println( iGCD(7,11));

//        System.out.println(GCD(15,24));

        System.out.println(armstrong(153));
    }
}
