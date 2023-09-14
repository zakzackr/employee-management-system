package com.springboot.emsbackend.Mapper;

import com.springboot.emsbackend.dto.EmployeeDto;
import com.springboot.emsbackend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartment().getId()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                null
        );

//        Employee employee = new Employee();
//        employee.setId(employeeDto.getId());
//        employee.setFirstName(employeeDto.getFirstName());
//        employee.setLastName(employeeDto.getLastName());
//        employee.setEmail(employeeDto.getEmail());
    }
}
