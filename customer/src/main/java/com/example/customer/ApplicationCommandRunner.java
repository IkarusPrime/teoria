package com.example.customer;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationCommandRunner implements CommandLineRunner {
	
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	CustomerService customerservice;

	@Override
	public void run(String... args) throws Exception {

		logger.info("Welcome to the runner from commandLineRunner");
		
		Customer customer1 = new Customer("1","Tom", "Jones", 1968);
		Customer customer2 = new Customer("2", "Silvia", "Eriksson", 2000);
		Customer customer3 = new Customer("3", "Anna", "Britzles", 1991);
		Customer customer4 = new Customer("4", "Paul", "Gates", 1645);

		customerservice.save(customer1);
		customerservice.save(customer2);
		customerservice.save(customer3);
		customerservice.save(customer4);
		
		logger.info(customerservice.findAll());
		
		customerservice.findAnddeleteById("1");
		
		logger.info(customerservice.findAll());

	}

}
