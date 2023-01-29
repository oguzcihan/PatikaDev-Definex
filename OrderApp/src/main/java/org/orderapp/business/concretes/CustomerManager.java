package org.orderapp.business.concretes;

import org.orderapp.business.abstracts.CustomerService;
import org.orderapp.data.repositories.abstracts.IBaseRepository;
import org.orderapp.entities.Customer;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

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
        return _baseRepository.customers().stream()
                .map(Customer::toString).collect(Collectors.toList());
    }

    @Override
    public List<String> getCustomerByLetterC() {
        return _baseRepository.customers().stream()
                .filter(customer -> customer.getFirstname().contains("C".toLowerCase()))
                .map(Customer::toString)
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> getCustomersRegisteredInJune() {
        return _baseRepository.customers().stream()
                .filter(customer -> customer.getRegisterDate().getMonth() == Month.JUNE)
                .collect(Collectors.toList());
    }
}
