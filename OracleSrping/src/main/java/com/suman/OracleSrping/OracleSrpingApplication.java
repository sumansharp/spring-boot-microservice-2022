package com.suman.OracleSrping;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.suman.OracleSrping.entiry.Customer;
import com.suman.OracleSrping.repository.CustomerRepository;

@SpringBootApplication
@Component
public class OracleSrpingApplication implements CommandLineRunner {

	public static Logger logs= LoggerFactory.getLogger(OracleSrpingApplication.class);
	
	@Autowired
	private CustomerRepository custRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OracleSrpingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer cust=new Customer("Suman", "Manager");
		custRepository.save(cust);
		
		logs.info("One Row Inserted: "+ cust);
		
		List<Customer> list=custRepository.findAll();
		logs.info("Retireved Data: " + list);
		
		
		
	}

}
