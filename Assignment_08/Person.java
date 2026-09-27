// Assignment8_Q1

import java.util.*;

class Person {

    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String n1 = sc.nextLine();
        System.out.println("Enter age:");
        int a1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String n2 = sc.nextLine();
        System.out.println("Enter age:");
        int a2 = sc.nextInt();

        Person p1 = new Person(n1, a1);
        Person p2 = new Person(n2, a2);

        p1.display();
        p2.display();
        sc.close();
    }
}
