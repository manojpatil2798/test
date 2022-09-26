package com.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Model.Employee;
import com.employee.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return this.empService.saveEmployee(emp);
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getListEmployee(){
		
		return this.empService.getEmployeeList();
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmp(@RequestBody Employee emp) {
		String msg=this.empService.updateEmployee(emp);
		return msg;
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable("id") int id) {
		System.out.println(id);
		String msg=this.empService.deleteEmployee(id);
		return msg;
		
	}

}
