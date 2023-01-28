package org.orderapp.business.abstracts;

import org.orderapp.entities.Customer;

import java.util.List;

public interface CustomerService {

    void add(Customer customer);
    List<String> getAll();
    List<String> getCustomerByLetterC();
    List<Customer> getCustomersRegisteredInJune();
}
