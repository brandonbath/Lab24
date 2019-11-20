package co.grandcircus.Lab24.model;

import org.springframework.stereotype.Component;

@Component
public class User {

	int id;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String password;
	String gender;

	public User() {

	}

	public User(String firstName, String lastName, String email, String phoneNumber, String password, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.gender = gender;
	}
	
	

	public User(int id, String firstName, String lastName, String email, String phoneNumber, String password,
			String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Hello " + firstName + "! You're a " + gender + ". Thank you for registering.\n" + "Email: " + email
				+ ".\n" + "Phone: " + phoneNumber;
	}

}
