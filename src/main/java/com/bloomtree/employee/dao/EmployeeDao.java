package com.bloomtree.employee.dao;

import java.util.List;

import com.bloomtree.employee.model.TestEmployee;

public interface EmployeeDao {

	TestEmployee findById(int id);

	void saveEmployee(TestEmployee employee);
	
	void deleteEmployeeBySsn(String ssn);
	
	List<TestEmployee> findAllEmployees();

	TestEmployee findEmployeeBySsn(String ssn);

}
