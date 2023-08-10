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

    public Customers insertEmployee(Customers customers) throws RecordExistsException {
        if(repository.existsById(customers.getCustomerId()))
            throw new RecordExistsException("Customer with "+ customers.getCustomerId()+"already exists");
        long count = this.repository.count();
        customers.setCustomerId(count+1);
        Customers savedEmployee = repository.save(customers);
        System.out.printf("There are now %d employees\n", repository.count());
        return  savedEmployee;
    }
    // Get all employees.
    public List<Customers> getAllCustomers()
    {
        return this.repository.findAll();
    }
    public Customers getCustomerById(long cusid) throws RecordNotFoundException {
        return repository.findById(cusid)
                .orElseThrow(()->new RecordNotFoundException("employee with "+cusid+" does not exist"));
    }
    // Get all employees by region.
//    public List<Customer> getAllCustomerByRegion(String region) {
//        return this.repository.findCustomerByRegion(region);
//    }
//    // Get all employees by salary range.
//    public List<Customer> getAllCustomersalaryRangen(double from , double to) {
//        return this.repository.findEmployeesInSalaryRange(from, to);
//    }
//    // Get a page of employees.
//    public EmployeePerPageResponse getEmployeesByPagination(int pageno, int size) {
//        Pageable pageable = PageRequest.of(pageno, size);
//        Page<Employee> page = repository.findAll( pageable);
//        int totalPages = page.getTotalPages();
//        long totalElements = page.getTotalElements();
//        int noofelements = page.getNumberOfElements();
//        int pagesize = page.getSize();
//        EmployeePerPageResponse response = new EmployeePerPageResponse();
//        response.setEmployees(page.getContent());
//        response.setNoofelements(noofelements);
//        response.setPagesize(pagesize);
//        response.setTotalElements(totalElements);
//        response.setTotalPages(totalPages);
//        return response;
//    }
//
//    public void updateEmployee( Employee empToUpdate) throws RecordNotFoundException {
//        System.out.println("UPDATE "+empToUpdate.getEmployeeId());
//        if(! repository.existsById(empToUpdate.getEmployeeId()))
//            throw new RecordNotFoundException("employee with "+empToUpdate.getEmployeeId()+" does not exist");
//        repository.save(empToUpdate);
//    }
//    public void deleteEmployee(long employeeId) throws RecordNotFoundException {
//
//        if(repository.existsById(employeeId))
//            throw new RecordNotFoundException("employee with "+employeeId+" does not exist");
//        repository.deleteById(employeeId);
//    }

}
