package pro.sky.javacourse2lesson28.service;

import pro.sky.javacourse2lesson28.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(String firstName, String lastName, int salary, String department);
    Employee remove(String firstName, String lastName, int salary, String department);
    Employee find(String firstName, String lastName, int salary, String department);
    List<Employee> getAll();
}
