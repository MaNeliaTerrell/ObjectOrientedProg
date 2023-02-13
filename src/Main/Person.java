package Main;

public class Person {

    String firstName;
    String lastName;
    int age;
    char gender;

    //------Constructor-----

    Person(String firstName, String lastName, char gender, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;

        System.out.println("Person Created");
    }

}
