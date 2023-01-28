package org.orderapp.data.repositories.concretes;

import org.orderapp.data.repositories.abstracts.IBaseRepository;
import org.orderapp.entities.Company;
import org.orderapp.entities.Customer;
import org.orderapp.entities.Invoice;
import org.orderapp.entities.Order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseRepository implements IBaseRepository {
    @Override
    public List<Customer> customers() {
        return new ArrayList<>();
    }

    @Override
    public List<Company> companies() {
        return new ArrayList<>();
    }

    @Override
    public List<Invoice> invoices() {
        return new ArrayList<>();
    }

    @Override
    public Set<Order> orders() {
        return new HashSet<>();
    }
}
