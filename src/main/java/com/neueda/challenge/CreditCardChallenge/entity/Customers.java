package com.neueda.challenge.CreditCardChallenge.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Customers")
public class Customers {
    @Id
    private String _id;
    @Field("customer_id")
    private long customerId;

    private String first;
    private String last;

    private String gender;
    private String job;
    private String dob;

    public Customers() {
        //empty one
    }

    public Customers(long customerId, String firstName, String lastName, String gender, String job, String dob) {
//        this._id = _id;
        this.customerId = customerId;
        this.first = firstName;
        this.last = lastName;
        this.gender = gender;
        this.job = job;
        this.dob = dob;
    }
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return first;
    }

    public void setFirstName(String firstName) {
        this.first = firstName;
    }

    public String getLastName() {
        return last;
    }

    public void setLastName(String lastName) {
        this.last = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }
}
