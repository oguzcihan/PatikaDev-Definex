package org.orderapp.data.repositories.abstracts;

import org.orderapp.entities.Company;
import org.orderapp.entities.Customer;
import org.orderapp.entities.Invoice;
import org.orderapp.entities.Order;

import java.util.List;
import java.util.Set;

public interface IBaseRepository {

    List<Customer> customers();
    List<Company> companies();
    List<Invoice> invoices();
    Set<Order> orders();

}
