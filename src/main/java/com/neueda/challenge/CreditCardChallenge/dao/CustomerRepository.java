package com.neueda.challenge.CreditCardChallenge.dao;

import com.neueda.challenge.CreditCardChallenge.entity.Customers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customers,Long> {
//    List<CustomObjectInputStream> findEmployee
}
