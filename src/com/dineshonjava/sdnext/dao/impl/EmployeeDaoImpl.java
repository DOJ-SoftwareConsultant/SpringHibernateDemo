package com.dineshonjava.sdnext.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dineshonjava.sdnext.dao.EmployeeDao;
import com.dineshonjava.sdnext.dao.util.SuperHibernateDaoSupport;
import com.dineshonjava.sdnext.domain.Employee;

/**
 * @author Dinesh Rajput
 *
 */
@Repository
public class EmployeeDaoImpl extends SuperHibernateDaoSupport implements EmployeeDao {

	@Override
	public void createEmployee(Employee employee) {
		getHibernateTemplate().saveOrUpdate(employee);
	}

	@Override
	public Employee getEmployee(Integer empid) {
		return (Employee) getHibernateTemplate().get(Employee.class, empid);
	}

	@Override
	public List<Employee> listEmployees() {
		return getHibernateTemplate().find("FROM Employee");
	}

	@Override
	public void delete(Employee employee) {
		getHibernateTemplate().delete(employee);
	}

	@Override
	public void update(Employee employee) {
		getHibernateTemplate().saveOrUpdate(employee);
	}

}
