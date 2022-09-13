package org.capgemini.flight.repository;

import java.util.List;

import org.capgemini.flight.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Integer>{

	boolean existsById(int id);

	List<Customer> findAll();

}
