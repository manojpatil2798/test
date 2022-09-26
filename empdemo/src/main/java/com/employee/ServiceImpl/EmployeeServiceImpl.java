package com.employee.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Dao.EmployeeRepo;
import com.employee.Model.Employee;
import com.employee.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeDao;

	@Override
	public Employee saveEmployee(Employee emp) {
		Employee emp1=null;
		try {
			emp1 = this.employeeDao.save(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp1;
	}

	@Override
	public List<Employee> getEmployeeList() {
		List<Employee> list=null;
		try {
		  list = this.employeeDao.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String updateEmployee(Employee emp) {
		String msg="";
		try {
			Employee updateEmp = this.employeeDao.save(emp);
			if(updateEmp.getId()==emp.getId())
				msg="update Sucessfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String deleteEmployee(int id) {
		String msg=null;
		try {
			this.employeeDao.deleteById(id);
			msg="delete successFully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	

}
