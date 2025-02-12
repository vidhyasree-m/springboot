package com.example.demo;

import java.util.List;
import org.springframework.data.repository.CrudRepository; //provides CRUD operations

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
    /*Spring Data JPA automatically translates findByLastName into an sql query
     * SELECT * FROM customer WHERE lastName = ?;
     */
	List<Customer> findByLastName(String lastName);

	Customer findById(long id);//Retrieves an entity by its ID
}