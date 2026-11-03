package com.portfolio.customermanagement.service;

import com.portfolio.customermanagement.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import com.portfolio.customermanagement.model.Customer;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
    public Optional<Customer> updateCustomer(Long id, Customer updatedCustomer) {

        return customerRepository.findById(id).map(existingCustomer -> {

            existingCustomer.setName(updatedCustomer.getName());
            existingCustomer.setEmail(updatedCustomer.getEmail());

            return customerRepository.save(existingCustomer);
        });
    }
}