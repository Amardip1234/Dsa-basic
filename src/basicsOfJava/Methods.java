package basicsOfJava;

public class Methods {

    static int sum(int a , int b){
        int ans = a+b;
        return ans;
    }
    int a;
    int b;
    Methods(int x , int y){
        a=x;
        y=b;
        System.out.println();
    }

    static  int func(int a){
        a += 100;
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
        int a = 50;
        func(a);
        System.out.println(a);
    }

}
