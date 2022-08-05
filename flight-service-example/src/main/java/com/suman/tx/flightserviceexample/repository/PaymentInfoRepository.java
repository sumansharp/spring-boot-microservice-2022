package com.suman.tx.flightserviceexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suman.tx.flightserviceexample.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String>{

}
