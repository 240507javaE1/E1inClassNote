package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDao {
	//create
		void add(Employee e);
		
		//read
		List<Employee> selectAll();
		List<Employee> selectById(int id);
		
		//update
		void update(Employee e);
		
		//delete

		void delete(int id);
}