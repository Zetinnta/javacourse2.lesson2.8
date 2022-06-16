package pro.sky.javacourse2lesson28;

public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private int salary;

    public Employee(String firstName, String lastName, int salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getEmployeeSalary() {
        return this.salary;
    }

    public String getEmployeeDepartment() {
        return this.department;
    }

}

