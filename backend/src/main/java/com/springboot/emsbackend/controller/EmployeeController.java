package com.springboot.emsbackend.controller;

import com.springboot.emsbackend.dto.EmployeeDto;
import com.springboot.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping ("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    // Build Add employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id){
        EmployeeDto employeeDto = employeeService.getEmployeeById(id);
//        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
        return ResponseEntity.ok(employeeDto);
    }

    // Build Get all employees REST API
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    // Build Update employees REST API
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployees(@PathVariable Long id,
                                                       @RequestBody EmployeeDto updatedEmployee){
        EmployeeDto employeeDto = employeeService.updateEmployees(id, updatedEmployee);
        return ResponseEntity.ok(employeeDto);
    }

    //Build Delete employees REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("The employee has been successfully deleted!!");
    }

}
