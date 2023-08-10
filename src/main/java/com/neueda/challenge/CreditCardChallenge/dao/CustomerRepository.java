package com.neueda.challenge.CreditCardChallenge.dao;

import com.neueda.challenge.CreditCardChallenge.entity.Customer;
import org.apache.catalina.util.CustomObjectInputStream;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,Long> {
//    List<CustomObjectInputStream> findEmployee
}
