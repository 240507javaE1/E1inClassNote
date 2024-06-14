package dao;

import java.util.List;

import model.Employee;
import model.Product;

public interface ProductDao {
	//create
			void add(Employee e);
			
			//read
			List<Product> selectAll();
			List<Product> selectById(int id);
			
			//update
			void update(Product e);
			
			//delete

			void delete(int id);

}