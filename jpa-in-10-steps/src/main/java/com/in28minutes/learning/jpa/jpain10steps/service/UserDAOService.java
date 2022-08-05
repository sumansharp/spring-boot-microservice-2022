package com.in28minutes.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.in28minutes.learning.jpa.jpain10steps.entity.Users;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	 public long insert(Users user) {
		 
		 entitymanager.persist(user);
		 return user.getId();
	 }
}
