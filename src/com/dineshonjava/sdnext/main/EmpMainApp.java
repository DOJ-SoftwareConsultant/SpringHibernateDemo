package com.dineshonjava.sdnext.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dineshonjava.sdnext.dao.EmployeeDao;
import com.dineshonjava.sdnext.domain.Employee;

/**
 * @author Dinesh Rajput
 *
 */
public class EmpMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDaoImpl");
		
		/*Employee employee = new Employee();
		employee.setName("DAV");
		employee.setAge(21);
		employee.setSalary(50000l);
		System.out.println("------Records Creation--------" );
		empDao.createEmployee(employee);*/
		
		/*System.out.println("------Listing Multiple Records--------" );
		List<Employee> employees = empDao.listEmployees();
		for (Employee emp: employees) {
	         System.out.print(emp);
	    }*/
		System.out.println("------find one Records--------" );
		Employee employee = empDao.getEmployee(3);
		System.out.print(employee);
		System.out.println("------Delete one Records--------" );
		empDao.delete(employee);
	}
}
