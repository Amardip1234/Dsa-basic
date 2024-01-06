package basicsOfJava;
import javax.swing.*;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your numm");
//        int n  = sc.nextInt();
//        System.out.println("lucky num is "+ n);
//



//        problems on Loops


//        (1st problem count of digits)

//        int num = sc.nextInt();
//        int count = 0;
//        while (num>0){
//            num = num/10;
//            count++;
//        }
//        System.out.println("The digits of num is :" +count);




//        (2nd problem sum of digits)

//        int inp = sc.nextInt();
//        int sum =0;
//       int  n = inp;
//        while (inp>0){            //n = 1234
//           n = inp%10;  //1234  //n =4, 3 ,2, 0
//           inp= inp/10;         // inp = 123 ,12, 1 , 0
//
//            sum =  sum+n;       // sum = 4 ,7, 9
//        }
//        System.out.println("sum of digits :" +sum);




//        (3rd problem reverse an integer)

//        int n = sc.nextInt();   //2346
//        int sum = 0;
//        while (n>0){
//            sum=  (sum*10)+n%10;   // 0+6           sum = 6 , 64,
//            n/=10;   or n = n/10             // 234 , 23
//        }
//        System.out.println("Reversed num : "+sum );




//        (4th problem find the sum of series)

//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i<=n; i++){  // 1
//            if (i%2 ==0){
//                sum-=i;      // 0
//            }else {
//                sum+=i;      // 0+1-2+3-4
//            }
//        }
//        System.out.println(sum);



//        (5th problem  factorial )

//        int n = sc.nextInt();
//        int fact = 1;
//        for (int i =1; i<=n; i++){
//            fact = fact* i;
//            System.out.println("The factorial of "+i+" is "+fact);
//        }



//        nested loops problems

//        for (int i =0;i<5; i++){
//            for (int j =0; j<5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        hollow rectangle start pattern

//        for (int i =1; i<=4; i++){
//            for (int j =1; j<=4; j++){
//                if (i==1|| i==4|| j==1|| j==4){
//                    System.out.print("*");
//                }else {
//                    System.out.print(' ');
//                }
//            }
//            System.out.println();
//        }


//        triangle pattern

//        for (int i = 1; i<5; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

//        reverse triangle

//        for (int i = 5; i> 1; i--){
//            for (int j = i; j>1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        // printing star pyramid pattern

//            for (int i = 1; i <= 4; i++) {
//                for (int j = 3; j >= i; j--) {
//                    System.out.print(' ');
//                }
//                for (int k =1; k<=i; k++){
//                    System.out.print(" *");
//                }
//                System.out.println();
//            }


//        rectangle number pattern printing

//        for (int i = 1; i<=7; i++){
//            for (int j = i; j<=7; j++){
//                System.out.print(j);
//            }
//            for (int k = 1; k<= i-1; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

//      printing 1 to 6 number rectangle pattern

//        for (int i=1; i<=4; i++){
//            for (int k=1; k<=6; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }


        //      Hollow rectangle pattern printing

//        for (int i = 1; i<=4; i++){
//            for (int j =1;j<=4; j++){
//                if ( i==1 || i==4 || j==1|| j==4){
//                    System.out.print('*');
//                }else {
//                    System.out.print(' ');
//                }
//            }
//            System.out.println();
//        }


//        print odd even matrix pattern rectangle

//        for (int i = 1; i<=4; i++){
//            for (int j = 1; j<=6; j++){
//                if ((i+j)%2==0){
//                    System.out.print(1);
//                }else {
//                    System.out.print(2);
//                }
//            }
//            System.out.println();
//        }

//        numerical triangular pattern

//        for (int i=1;i<=4; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        Hollow numerical pyramid

//        for (int i = 1; i<=4; i++){
//            for (int j = 3; j>=i; j--){
//                System.out.print("  ");
//            }
//            for (int k=1;k<=i; k++){
//                System.out.print(" "+k);
//            }
//            for (int l = i-1; l>=1; l--){
//                System.out.print(" "+l);
//            }
//            System.out.println();
//        }


//        for (int i = 1; i<=4; i++){
//            for (int l =3; l>=i; l--){
//                System.out.print("  ");
//            }
//            for (int j = 1; j<=i; j++){
//                if (i==1 || i==4 || j==1|| j==i){
//                    System.out.print("   "+i);
//                }else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }








    }
}