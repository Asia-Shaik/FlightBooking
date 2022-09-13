package org.capgemini.flight.controller;

import java.util.List;

import org.capgemini.flight.model.Customer;
import org.capgemini.flight.service.CustomerService;
import org.capgemini.flight.service.CustomerValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/customer")
public class CustomerController {

@Autowired
   private CustomerService customerservice;
private int id;

@PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer customer)  throws CustomerValidationException{
	return customerservice.addCustomer(customer);
       }


    @GetMapping("/findAllCustomers")
 public List<Customer> getcustomer(){
  return customerservice.getCustomer();
  
  
   }
    
    
    
    @DeleteMapping("/delete/{id}")
 public String deleteCustomers(@PathVariable int id) {
 customerservice.deleteCustomer(id);
     return "customer deleted with id: "+id;
     
    }
    
   @PutMapping("/update/{id}")
        public Customer updateCustomers(@PathVariable int id,@RequestBody Customer customer) {
	return customerservice.updateNameById(id , customer);
	    
    }
}