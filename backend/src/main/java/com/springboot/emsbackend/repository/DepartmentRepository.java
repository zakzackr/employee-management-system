package com.springboot.emsbackend.repository;

import com.springboot.emsbackend.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

// once DepartmentRepository interface extends JpaRepository interface, the DepartmentRepository will get CRUD methods to perform CRUD database operations on department entity.
// No need to implements this interface as Spring data JpaRepository will automatically provide the implementation for all the CRUD methods
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
