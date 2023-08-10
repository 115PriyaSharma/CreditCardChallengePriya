package com.neueda.challenge.CreditCardChallenge.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Transactions {
    @Id
    private long customerId;
    private String firstName;
    private String lastName;
    private String gender;
    private String job;
    private Date dob;
    private Date transactionDate;
    private Date transactionTime;
    private double amt;
    private double transactionNum;
    private String city;
    private String state;
    private long cityPopulation;
    private String merchant;
    private String category;

}
