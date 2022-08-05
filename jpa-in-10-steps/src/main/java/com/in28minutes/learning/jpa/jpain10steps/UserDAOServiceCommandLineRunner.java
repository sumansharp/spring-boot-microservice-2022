package com.in28minutes.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.entity.Users;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;
//https://www.youtube.com/watch?v=MaI0_XdpdP8

//Oracle connection URL
//https://www.youtube.com/watch?v=KFGeS25oTKA


@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {
	 public static Logger log=LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDAOService; 
	
	@Override
	public void run(String... args) throws Exception {

		Users user=new Users("Jack", "Admin");
		long insert=userDAOService.insert(user);
		log.info("New User is created"+user);
	}

}
