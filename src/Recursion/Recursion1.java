package Recursion;

import java.util.Scanner;

public class Recursion1 {

    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    static void printDecreasing(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

    static int printFactorial(int n){
        if (n==1) return 1;
        return n*printFactorial(n-1);
    }

    static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        return  fibonacci(n-1)+fibonacci(n-2);
    }


    static int sumdigit(int n){
        if (n>=0 && n<=9){
            return n;
        }
        return sumdigit(n/10)+n%10;
    }

    static int countdigit(int n){
        if (n==0){
            return 0;
        }
       return countdigit(n/10)+1;
    }


    static int paw(int p , int q){
        if (q==0){
            return 1;
        }

        return paw(p,q-1)*p;
    }

//    another approach of paw;

    static int paw2(int p, int q){
        if(q==0){
            return 1;
        }

        int smallCase = paw2(p, q/2);


        if (q%2==0){
            return smallCase*smallCase;
        }
            return smallCase*smallCase*p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printIncreasing(n);

//        printDecreasing(n);

//        System.out.println(printFactorial(n));


//        for (int i =0; i<=10;i++){
//            System.out.println(fibonacci(i));
//        }

//        System.out.println(sumdigit(12345));


//        System.out.println(countdigit(123));

//        System.out.println(paw(2,3));

//        System.out.println(paw2(2,4));
    }
}
