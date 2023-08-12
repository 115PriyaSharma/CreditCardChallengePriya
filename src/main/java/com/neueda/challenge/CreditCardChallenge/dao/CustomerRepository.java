package com.neueda.challenge.CreditCardChallenge.dao;

import com.neueda.challenge.CreditCardChallenge.entity.Customers;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customers,String> {
    List<Customers> findAllByCustomerId(long customerId);
}
