package dao;

import java.util.List;

import model.Employee;
import model.Porder;

public interface PorderDao {
	//create
			void add(Employee e);
			
			//read
			List<Porder> selectAll();
			List<Porder> selectById(int id);
			
			//update
			void update(Employee e);
			
			//delete

			void delete(int id);
}