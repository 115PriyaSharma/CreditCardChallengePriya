package com.neueda.challenge.CreditCardChallenge.service;

import com.neueda.challenge.CreditCardChallenge.dao.CustomerRepository;
import com.neueda.challenge.CreditCardChallenge.entity.Customers;
import com.neueda.challenge.CreditCardChallenge.exception.RecordExistsException;
import com.neueda.challenge.CreditCardChallenge.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    // Get all employees.
    public List<Customers> getAllCustomers()
    {
        return this.repository.findAll();
    }
    public List<Customers> getCustomerByCustomerId(long cusid)
    {
        return repository.findAllByCustomerId(cusid);
    }


}
