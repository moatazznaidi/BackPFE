package com.example.stagepfe.Controller;

import com.example.stagepfe.Service.EmployeeService;
import com.example.stagepfe.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }


    @PostMapping("/add")
    public Employee saveEmployee(@RequestBody Employee employees) {
        return employeeService.saveEmployee(employees);
    }

    @PutMapping("/modify")
    public Employee ModifEmployee(@RequestBody Employee employees) {
        return employeeService.saveEmployee(employees);
    }


//    @PutMapping(value = "/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Employee ModifEmployee(@RequestBody Employee employee) {
//        return employeeService.saveEmployee(employee);
//    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }


}