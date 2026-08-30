
import java.util.*;

class employee {

    String name;
    String job;
    double salary;

    double calculate(int wd) {
        double dailySalary = salary / 30;
        return dailySalary * wd;
    }

    void update(int workingDays) {
        salary = calculate(workingDays);
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Job = " + job);
        System.out.println("Salary = " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee e = new employee();
        System.out.println("Enter Name: ");
        e.name = sc.next();
        System.out.println("Enter Job Title: ");
        e.job = sc.next();
        System.out.println("Enter Salary: ");
        e.salary = sc.nextDouble();
        System.out.println("Enter working days: ");
        int wd = sc.nextInt();
        e.update(wd);
        double newSalary = e.calculate(wd);
        System.out.println("Calculated Salary = " + newSalary);
        System.out.println("Updated Employee Details:");
        e.display();
    }
}
