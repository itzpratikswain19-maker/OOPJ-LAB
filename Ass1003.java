class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student() {
        this("Unknown", 0);
    }

    void display() {
        System.out.println("Name = " + name + ", Age = " + age);
    }

    Student self() {
        return this;
    }
}

public class Ass1003 {
    public static void main(String[] args) {
        Student s1 = new Student("Ryan", 20);
        s1.display();

        Student s2 = new Student();
        s2.display();

        Student s3 = s1.self();

        System.out.println("s1 and s3 are same object: " + (s1 == s3));
    }
}
