package basicsOfJava;



import java.util.Scanner;

class cars {
    String color ;
    String Company;
}

class student{
    String name;
    int roll;

}
public class Person {
    int age = 23;
    public static void main(String[] args) {
        Person Amar = new Person();
//        System.out.println(Amar.age);

        cars bmw = new cars();

        bmw.color = "BLue";
        bmw.Company = "atlas";
//        System.out.println(bmw.color);

        student name = new student();
        name.name = "Amar";
        System.out.println(name.name);


    }
}
