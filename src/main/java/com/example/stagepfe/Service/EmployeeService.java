package com.example.stagepfe.Service;
import com.example.stagepfe.models.Employee;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Long id);

    public Employee saveEmployee(Employee employees);

    public void deleteEmployee(Long id);}