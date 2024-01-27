package com.springboot.emsbackend.service;

import com.springboot.emsbackend.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {

    EmployeeDto getEmployeeById(Long employeeId);

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployees(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}





