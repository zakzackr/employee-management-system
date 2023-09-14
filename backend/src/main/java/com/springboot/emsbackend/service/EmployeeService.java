package com.springboot.emsbackend.service;

import com.springboot.emsbackend.dto.EmployeeDto;
import com.springboot.emsbackend.entity.Employee;
import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployees(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
