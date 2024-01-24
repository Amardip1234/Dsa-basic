import pw.skiils.App;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {

        App obj = new App();
//        System.out.println("printing outside from package: "+obj.str);
        App3 obj2 = new App3();
        obj2.printfromChildClass();
    }
}

class App3 extends App{
    void printfromChildClass(){
        App3 obj = new App3();
        System.out.println("printing from child class: "+obj.str);
    }
}