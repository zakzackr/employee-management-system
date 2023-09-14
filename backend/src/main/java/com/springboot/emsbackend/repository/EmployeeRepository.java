package com.springboot.emsbackend.repository;


import com.springboot.emsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// EmployeeRepository gets CRUD methods to perform CRUD database operations on Employee JPA entity
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
