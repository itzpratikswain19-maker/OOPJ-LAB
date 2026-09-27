// Assignment9_Q3

class Person {

    String firstName;
    String lastName;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {

    String empId;
    String jobTitle;

    String getEmployeeId() {
        return empId;
    }

    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }

    String getEmployeeInfo() {
        return firstName + " " + getLastName() + " - " + getEmployeeId();
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.empId = "Emp101";
        e.firstName = "Rahul";
        e.lastName = "Kumar";
        e.jobTitle = "Software Architect";

        System.out.println(e.getEmployeeInfo());
    }
}
