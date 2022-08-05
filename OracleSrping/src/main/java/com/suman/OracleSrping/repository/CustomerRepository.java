package com.suman.OracleSrping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suman.OracleSrping.entiry.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
