package com.example.demo;

//Java Persistence API (JPA) annotations that allow Spring Boot to map the class to a database table
import jakarta.persistence.Entity; //Marks this class as a database entity
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; //specifies the primary key field of the entity

@Entity
public class Customer {
 
	//This defines id as the primary key
	@Id
	//This tells JPA to automatically generate unique values for id when a new customer is created.
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
    /*
     * This is a default constructor required by JPA
     * JPA needs a no-argument constructor to create objects using reflection
     * Making it protected prevents accidental use by other parts of the application
     */
	protected Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}
    //getter methods
	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
