package com.employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
