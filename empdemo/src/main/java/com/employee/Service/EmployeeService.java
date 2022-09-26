package com.employee.Service;

import java.util.List;

import com.employee.Model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee emp);
	
	public List<Employee> getEmployeeList();

	public String updateEmployee(Employee emp);

	public String deleteEmployee(int id);

}
