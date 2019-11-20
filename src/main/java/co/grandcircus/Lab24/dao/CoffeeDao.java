package co.grandcircus.Lab24.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.Lab24.model.Product;
import co.grandcircus.Lab24.model.User;



@Repository
public class CoffeeDao {	

	@Autowired

	private JdbcTemplate jdbcTemplate; 

	public List<User> findAllUsers() { // (READ from CRUD)
		return jdbcTemplate.query("SELECT * FROM person", new BeanPropertyRowMapper<User>(User.class));
	}
		
	// (CREATE in CRUD)
		public int addUser(String firstName, String lastName, String email, String phoneNumber, String password, String gender) {
			String addQuery = "insert into person(firstName, lastName, email, phoneNumber, password, gender) values(?,?,?,?,?,?)";
			// bringing strings in and adding a new food with SQL query

			return jdbcTemplate.update(addQuery, firstName, lastName, email, phoneNumber, password, gender); 
		}
		
		// updating a Food object
		public int updateUser(User userObj) {
			String updateQuery = "update person set firstName= ?, lastName= ?, email= ?, phoneNumber= ?, password= ?, gender= ? where id= ?";
			return jdbcTemplate.update(updateQuery, userObj.getFirstName(), userObj.getLastName(), userObj.getEmail(), userObj.getPhoneNumber(),
					userObj.getPassword(), userObj.getGender(), userObj.getId());
		}
		
		public int deleteUser(int id) {
			String deleteQuery = "delete from person where id=?";
			return jdbcTemplate.update(deleteQuery, id);
		}
		
		public List<Product> findAllProducts() { // (READ from CRUD)
			return jdbcTemplate.query("SELECT * FROM Products", new BeanPropertyRowMapper<Product>(Product.class));
			// first param is query,
		}
}
