package com.neueda.challenge.CreditCardChallenge.controller;

//import com.boot.rest.SpringBootWebDemo.web01.dto.EmployeePerPageResponse;
//import com.boot.rest.SpringBootWebDemo.web01.entity.Employee;
//import com.boot.rest.SpringBootWebDemo.web01.exception.RecordExistsException;
//import com.boot.rest.SpringBootWebDemo.web01.exception.RecordNotFoundException;
//import com.boot.rest.SpringBootWebDemo.web01.service.EmployeeService;
//import com.boot.rest.SpringBootWebDemo.web01.utility.StatusMessages;

import com.neueda.challenge.CreditCardChallenge.entity.Customers;
import com.neueda.challenge.CreditCardChallenge.exception.RecordNotFoundException;
import com.neueda.challenge.CreditCardChallenge.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * If using @Controller then to create REST API's you need to add @ResponseBody on the methods
 * to return data as a response
 */

/**
 * Ideally there should not be separate paths for respective HTTP methods. The REST URI should not contain verbs in them.
 * Hence if path is http://localhhost:8080/employees,
 * then for the verbs/HTTP methods use respective GET/POST/PUT/DELETE annotations
 */
//@Controller // If using @Controller then @ResponseBody is used to create REST API
@RestController
/**
 * If the /employees is common across the mappings then there can be 1 root mapping as follows:
 * Remove the /employees mappings from other annotations
 */
@RequestMapping("/customers")
// @Tag is used to display name on swagger UI, ONLY IF SWAGGER ADDED AS DEPENDENCY
@Tag(name="CUSTOMERS-CONTROLLER")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;
    /**
     * @RequestMapping is a general annotation. To restrict access for different HTTP methods,
     * need to add method attribute separately
     * Instead use more composed annotations [@GetMapping, @PostMapping, @PutMapping, @DeleteMapping]
     * for all HTTP methods
     */
    //@RequestMapping("/employees/get")
    //@RequestMapping(path = "/employees/get",, method = RequestMethod.GET)
    //@GetMapping("/employees/get")
    /**
     * Just use annotations for respective HTTP methods and no need to put verbs within them
     * @return
     */
    @GetMapping("/get")
    public List<Customers> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    /**
     * Path variable is used to map the value passed in the path of url
     * http://localhost:8080/employees/10 => so 10 is mapped with employeeId
     * @param customerId
     * @return
     */
    @GetMapping("/{customerId}")
    public List<Customers> getCustomerById(@PathVariable long customerId)
    {
        return this.customerService.getCustomerByCustomerId(customerId);
    }

}
