package pro.sky.javacourse2lesson28.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.javacourse2lesson28.Employee;
import pro.sky.javacourse2lesson28.service.DepartmentServiceImpl;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentServiceImpl departmentServiceimpl;

    public DepartmentController(DepartmentServiceImpl departmentServiceimpl) {
        this.departmentServiceimpl = departmentServiceimpl;
    }

    @GetMapping(value = "/all", params = "departmentId")
    public List<Employee> allWithinSpecificDepartment(@RequestParam("departmentId") String department) {
        return departmentServiceimpl.AllEmployeesWithinSpecificDepartment(department);
    }

    @GetMapping("/all")
    public Map<String, List<Employee>> all() {
        return departmentServiceimpl.allEmployees();
    }

    @GetMapping("/max-salary")
    public Employee maxSalaryWithinSpecificDepartment(@RequestParam("departmentId") String department) {
        return departmentServiceimpl.maxSalaryWithinDepartment(department);
    }

    @GetMapping("/min-salary")
    public Employee minSalaryWithinSpecificDepartment(@RequestParam("departmentId") String department) {
        return departmentServiceimpl.minSalaryWithinDepartment(department);
    }
}
