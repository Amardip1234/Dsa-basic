package Recursion;

public class practise {
    static void printIcreasing(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        printIcreasing(n-1);
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

    static int factorial(int n){
        if (n==0){
            return 1;
        }
        int prod = factorial(n-1);

        return n*prod;
    }

    static int fibonacci(int n){
        if(n==0 || n==1) return n;
        return fibonacci(n-2)+fibonacci(n-1);
    }

    static int sumdigit(int n){
        if (n>=0 && n<=9){
            return n;
        }
        return sumdigit(n/10) + n%10;
    }


    static int countDigit(int n){
        if (n==0){
            return 0;
        }

        int count = countDigit(n/10);
        return count+1;
    }


    static int paw(int p , int q){
        if (q==0){
            return 1;
        }
       int smallCase =  paw(p,q-1);
       return smallCase*p;
    }

    static String remove(String s, int indx){
        if (indx == s.length()){
            return "";
        }

        String smallCase = remove(s,indx+1);
        char currChar = s.charAt(indx);
        if (currChar != 'a'){
            return currChar+smallCase;
        }else {
           return smallCase;
        }
    }
    public static void main(String[] args) {
//        printIcreasing(5);
//        printDecreasing(5);
//        System.out.println(factorial(5));

//        for (int i =0;i<=10; i++){
//            System.out.println(fibonacci(i));
//        }

//        System.out.println(sumdigit(1234));
//        System.out.println(countDigit(1234));
//        System.out.println(paw(2,4));

        String st = "am22aaar";
        System.out.println(remove(st,0));
    }
}
