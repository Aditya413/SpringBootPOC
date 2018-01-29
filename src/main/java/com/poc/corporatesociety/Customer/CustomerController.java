package com.poc.corporatesociety.Customer;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	private CustomerRepository customerRepository;

	public CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@GetMapping("/allValue")
	public List<Customer> getAllCustomer() {
		List<Customer> customerList = this.customerRepository.findAll();
		return customerList;
	}
	
	@PostMapping("/insertCustomer")
	public void insertCustomer(@RequestBody Customer custObj) {
		this.customerRepository.insert(custObj);
	}
	
	@PostMapping("/updateCustomer")
	public void updateCustomer(@RequestBody Customer custObj) {
		this.customerRepository.save(custObj);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable("id") String id) {
		this.customerRepository.delete(id);
	}
	
	@GetMapping("/getCustomerById/{id}")
	public Customer getCustomerById(@PathVariable("id") String id) {
		Customer customer = this.customerRepository.findById(id);
		return customer;
	}
}
