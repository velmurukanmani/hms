package com.bloomtree.employee.service;

import java.util.List;

import com.bloomtree.employee.model.TestEmployee;

public interface EmployeeService {

	TestEmployee findById(int id);
	
	void saveEmployee(TestEmployee employee);
	
	void updateEmployee(TestEmployee employee);
	
	void deleteEmployeeBySsn(String ssn);

	List<TestEmployee> findAllEmployees(); 
	
	TestEmployee findEmployeeBySsn(String ssn);

	boolean isEmployeeSsnUnique(Integer id, String ssn);
	
}
