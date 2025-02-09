package com.SpringData.Store.Repository;

import com.SpringData.Store.Model.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

