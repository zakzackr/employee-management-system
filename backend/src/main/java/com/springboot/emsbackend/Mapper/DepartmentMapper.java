package com.springboot.emsbackend.mapper;

import com.springboot.emsbackend.dto.DepartmentDto;
import com.springboot.emsbackend.entity.Department;

public class DepartmentMapper {
    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }

    public static DepartmentDto mapToDepartmentDto(Department department) {
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }
}
