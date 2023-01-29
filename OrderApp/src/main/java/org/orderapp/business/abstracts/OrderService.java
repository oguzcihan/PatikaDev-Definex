package org.orderapp.business.abstracts;

import org.orderapp.entities.Order;

import java.util.List;

public interface OrderService {

    void add(Order order);

    List<String> getAll();

    List<String> getAllByCustomerId(int id);
}
