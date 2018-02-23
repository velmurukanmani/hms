package com.bloomtree.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bloomtree.employee.dao.EmployeeDao;
import com.bloomtree.employee.model.TestEmployee;
import com.bloomtree.employee.service.EmployeeService;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public TestEmployee findById(int id) {
		return dao.findById(id);
	}

	public void saveEmployee(TestEmployee employee) {
		dao.saveEmployee(employee);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateEmployee(TestEmployee employee) {
		TestEmployee entity = dao.findById(employee.getId());
		if(entity!=null){
			entity.setName(employee.getName());
			entity.setJoiningDate(employee.getJoiningDate());
			entity.setSalary(employee.getSalary());
			entity.setSsn(employee.getSsn());
		}
	}

	public void deleteEmployeeBySsn(String ssn) {
		dao.deleteEmployeeBySsn(ssn);
	}
	
	public List<TestEmployee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	public TestEmployee findEmployeeBySsn(String ssn) {
		return dao.findEmployeeBySsn(ssn);
	}

	public boolean isEmployeeSsnUnique(Integer id, String ssn) {
		TestEmployee employee = findEmployeeBySsn(ssn);
		return ( employee == null || ((id != null) && (employee.getId() == id)));
	}
	
}
