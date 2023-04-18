package com.example.stagepfe.Service.imp;
import com.example.stagepfe.Repository.EmployeeRepository;
import com.example.stagepfe.Service.EmployeeService;
import com.example.stagepfe.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public  class EmployeeInterfaceImp implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
    @Override

    public Employee saveEmployee(Employee employees) {
        return employeeRepository.save(employees);
    }
    @Override

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
