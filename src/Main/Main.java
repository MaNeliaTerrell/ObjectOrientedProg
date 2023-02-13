package Main;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        //--------Lesson 1 --------

//        Person p = new Person();
//        p.firstName = "Nelia";
//        p.lastName = "Terrell";
//        p.gender = 'F';
//        p.age = 44;
//
//        Person p1 = new Person();
//        p1.firstName = "Alex";
//        p1.lastName = "Terrell";
//        p1.gender = 'M';
//        p1.age = 43;
//
//        System.out.println(p.firstName);

        //-------Lesson 2 --------


        //Person per = new Person();

//        Product p = new Product("banana", 10.50f);
//        Product p1 = new Product("apple", 12.35f); // create more than 1 object (obj 2)
//        Product p2 = new Product("lemon", 5.65f); // (obj 3)
//
//        Person per = new Person("Nelia", "Terrell", 'F', 44);
//
//        System.out.println(per.firstName);
//        System.out.println(per.lastName);

        Scanner s = new Scanner(System.in);

            System.out.print("Flower Name: ");
        String name = s.nextLine();
            System.out.print("Color: ");
        String color = s.nextLine();
            System.out.print("Season: ");
        String season = s.nextLine();
            System.out.print("Category: ");
        String category = s.nextLine();


        Flower f = new Flower(name, color, season, category);



    }
}