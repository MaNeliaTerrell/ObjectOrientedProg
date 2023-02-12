package Main;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.firstName = "Nelia";
        p.lastName = "Terrell";
        p.gender = 'F';
        p.age = 44;

        Person p1 = new Person();
        p1.firstName = "Alex";
        p1.lastName = "Terrell";
        p1.gender = 'M';
        p1.age = 43;

        System.out.println(p.firstName);
    }
}