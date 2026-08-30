
import java.util.*;

class student {

    String name, course;
    int roll_no;
    Scanner sc = new Scanner(System.in);

    void select() {
        System.out.println("choose a course: \n1.CSE\n2.ECE\n3.ME\n4.BT");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                course = "CSE";
                break;
            case 2:
                course = "ECE";
                break;
            case 3:
                course = "ME";
                break;
            case 4:
                course = "BT";
                break;
            default:
                course = "Invalid Course";
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Course: " + course);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        student s = new student();
        System.out.println("Enter Name: ");
        s.name = sc.next();
        System.out.println("Enter Roll No: ");
        s.roll_no = sc.nextInt();
        s.select();
        s.display();
    }

}
