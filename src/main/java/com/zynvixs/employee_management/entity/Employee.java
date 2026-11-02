package com.zynvixs.employee_management.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "First name is mandatory")
	private String firstName;

	@NotBlank(message = "Last name is mandatory")
	private String lastName;

	@Email(message = "Email should be valid")
	@NotBlank(message = "Email is mandatory")
	@Column(unique = true)
	private String email;

	@NotBlank(message = "Contact number is mandatory")
	@Column(unique = true)
	private String contact; // Added contact field

	@NotBlank(message = "Department is mandatory")
	private String department;

	@NotNull(message = "Salary is mandatory")
	private Double salary;

	// Constructors
	public Employee() {}

	public Employee(String firstName, String lastName, String email, String contact, String department, Double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.department = department;
		this.salary = salary;
	}

	// Getters and Setters
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public String getContact() { return contact; }
	public void setContact(String contact) { this.contact = contact; }
	public String getDepartment() { return department; }
	public void setDepartment(String department) { this.department = department; }
	public Double getSalary() { return salary; }
	public void setSalary(Double salary) { this.salary = salary; }
}  




