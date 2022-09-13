package org.capgemini.flight.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.capgemini.flight.model.Customer;
import org.capgemini.flight.repository.CustomerRepository;
import org.capgemini.flight.service.CustomerService;
import org.capgemini.flight.service.CustomerValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class CustomerServiceTest {

	private static final int id = 0;
	@Autowired
	private CustomerService service;
	@MockBean
	private CustomerRepository customerrepository;

	@Test
	@DisplayName("Get All Customer Test")
	public void getallCustomerTest() {
		when(customerrepository.findAll())
				.thenReturn((List<Customer>) Stream
						.of(new Customer(456, "neha", "bangalore", 444444, "aj@gmail.com"),
								new Customer(555, "sneha", "mangalore", 888888, "mk@gmail.com"))
						.collect(Collectors.toList()));
		assertEquals(2, service.getCustomer().size());
	}

	@Test
	@DisplayName("Adding Customer Test")
	public void addCustomerTest() throws CustomerValidationException {
		Customer customer = new Customer(345, "sona", "chennai", 666666, "gj@gmail.com");
		int id = 0;
		service.addCustomer(customer);
	}

	@Test
	@DisplayName("Update Test")
	public void updateNameByIdTest() {
		Customer customer = new Customer(567, "rani", "mumbai", 77777, "pg@gmail.com");
		int id = 0;
		service.updateNameById(id, customer);
	}

	@Test
	@DisplayName("Delete Test")
	public void deleteByIdTest() {
		Customer customer = new Customer(876, "usha", "manali", 99999, "mg@gmail.com");
		int id = 0;
		service.deleteCustomer(id);
		verify(customerrepository, times(1)).deleteById(id);
	}
}
