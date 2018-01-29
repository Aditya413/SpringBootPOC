package com.poc.corporatesociety.Customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataSeeder implements CommandLineRunner{
	
	private CustomerRepository customerRepository;
	
	public CustomerDataSeeder(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void run(String... arg0) throws Exception {
		Customer Aditya = new Customer("Aditya Bhatnagar", "8285169098", "adityabhatnagar413@gmail.com", "123456", "aditya413");
		Customer Pankaj = new Customer("Pankaj Bartwal", "8285169098", "pankajbartwal@gmail.com", "123456", "pankajbartwal");
		
		//delete existing user record
		this.customerRepository.deleteAll();
		
		//save our customer list into database
		List<Customer> customerList = Arrays.asList(Aditya,Pankaj);
		this.customerRepository.save(customerList);
	}
	
}
