package org.capgemini.flight.service;

import java.util.List;

import org.capgemini.flight.model.Customer;
import org.capgemini.flight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CustomerService  implements CustomerService1{
	
	
		//Calling Customer Repository
		private CustomerRepository customerRepository;
		CustomerService Customertservice;

		@Autowired
		public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
		}

		@Override
		public String addCustomer(Customer customer) throws CustomerValidationException  {
			if (customerRepository.existsById(customer.getId()))
				throw new CustomerValidationException();
				else {  
		
			customerRepository.save(customer);
			 return "Added Customer with id:"+ customer.getId();
		}


		}
		
		@Override
		public String deleteCustomer(int id) {
			customerRepository.deleteById(id);
		return "id deleted";

		}


		@Override
		public Customer updateNameById(int id, Customer customer) {
			return customerRepository.save(customer);

		}

		@Override
		public List<Customer> getCustomer() {
		return customerRepository.findAll();
		}

		public void save(Customer customer) {
			// TODO Auto-generated method stub
			
		}

		


		}





