package com.neueda.challenge.CreditCardChallenge;

import com.neueda.challenge.CreditCardChallenge.dao.CustomerRepository;
import com.neueda.challenge.CreditCardChallenge.entity.Customers;
import com.neueda.challenge.CreditCardChallenge.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication
public class CreditCardChallengeApplication {

	Logger logger = Logger.getLogger(CreditCardChallengeApplication.class.getSimpleName());
	@Autowired
	private CustomerRepository repository;

	@Autowired
	private static CustomerService s;
	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(CreditCardChallengeApplication.class, args);
		System.out.println("hello Vedika!!!");

//		System.out.println(s.getCustomerByCustomerId(123));
	}



	@Bean
	public void init() {
		logger.info("CUSTOMERS DATA ADDED");
		repository.save(new Customers(307,"James","Bond","Male", "CITI SLAVES", "24/02/2002"));
		repository.save(new Customers(23,"Steve","Jobs","Male", "Apple SLAVES", "04/01/2001"));
		repository.save(new Customers(2,"Elon","Musk","Female", "Queen", "09/08/2003"));
		repository.save(new Customers(3,"Baby","Doll","Female", "Queen", "11/12/2000"));
		repository.save(new Customers(4,"Naina","Darling","Female", "King", "07/02/2003"));
	}



}
