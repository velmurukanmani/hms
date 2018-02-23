package com.bloomtree.employee.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.bloomtree.employee.dao.AbstractDao;
import com.bloomtree.employee.dao.EmployeeDao;
import com.bloomtree.employee.model.TestEmployee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, TestEmployee> implements EmployeeDao {

	public TestEmployee findById(int id) {
		return getByKey(id);
	}

	public void saveEmployee(TestEmployee employee) {
		persist(employee);
	}

	public void deleteEmployeeBySsn(String ssn) {
		Query query = getSession().createSQLQuery("delete from TestEmployee where ssn = :ssn");
		query.setString("ssn", ssn);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<TestEmployee> findAllEmployees() {
		Criteria criteria = createEntityCriteria();
		return (List<TestEmployee>) criteria.list();
	}

	public TestEmployee findEmployeeBySsn(String ssn) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("ssn", ssn));
		return (TestEmployee) criteria.uniqueResult();
	}
}
