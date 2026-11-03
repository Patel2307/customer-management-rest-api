package com.portfolio.customermanagement.repository;

import com.portfolio.customermanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}