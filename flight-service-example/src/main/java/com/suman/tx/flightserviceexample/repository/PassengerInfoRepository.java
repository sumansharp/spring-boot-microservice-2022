package com.suman.tx.flightserviceexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suman.tx.flightserviceexample.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long>{

}
