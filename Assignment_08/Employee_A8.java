// Assignment8_Q3

class Employee_A8 {

    String name;
    double salary;
    int hiredate;

    int yearsOfService(int date) {
        int currentyear = 2026;
        hiredate = currentyear - date;
        return hiredate;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
        System.out.println("Years of service:" + hiredate);
    }

    public static void main(String args[]) {
        Employee_A8 e = new Employee_A8();
        e.name = "Pratik";
        e.salary = 100000;
        e.yearsOfService(2007);
        e.display();
    }
}
