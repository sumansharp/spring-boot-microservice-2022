package com.in28minutes.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.entity.Users;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;
import com.in28minutes.learning.jpa.jpain10steps.service.UserRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
//https://www.youtube.com/watch?v=MaI0_XdpdP8

@Component
public class UserRepositoryServiceCommandLineRunner2 implements CommandLineRunner {
	 public static Logger log=LoggerFactory.getLogger(UserRepositoryServiceCommandLineRunner2.class);
	
	@Autowired
	private UserRepository userRepository; 
	
	@Override
	public void run(String... args) throws Exception {

		Users user=new Users("Jill", "Admin");
		userRepository.save(user);
		log.info("New User is created"+user);
		
		Optional<Users> userWithIdOne= userRepository.findById(1L);
		log.info("User is retrived: "+userWithIdOne);
		
		List<Users> users=userRepository.findAll();
		log.info("Users retrived: "+ users);
	}

}
