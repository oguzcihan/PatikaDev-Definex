package org.orderapp.business.concretes;

import org.orderapp.business.abstracts.CustomerService;
import org.orderapp.data.repositories.abstracts.IBaseRepository;
import org.orderapp.entities.Customer;

import java.util.List;

public class CustomerManager implements CustomerService {

    private final IBaseRepository _baseRepository;

    public CustomerManager(IBaseRepository baseRepository) {
        _baseRepository = baseRepository;
    }

    @Override
    public void add(Customer customer) {
        _baseRepository.customers().add(customer);
    }

    @Override
    public List<String> getAll() {
        return null;
    }

    @Override
    public List<String> getCustomerByLetterC() {
        return null;
    }

    @Override
    public List<Customer> getCustomersRegisteredInJune() {
        return null;
    }
}
