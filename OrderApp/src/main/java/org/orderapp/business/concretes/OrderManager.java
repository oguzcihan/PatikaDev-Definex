package org.orderapp.business.concretes;

import org.orderapp.business.abstracts.OrderService;
import org.orderapp.data.repositories.abstracts.IBaseRepository;
import org.orderapp.entities.Customer;
import org.orderapp.entities.Invoice;
import org.orderapp.entities.Order;

import java.util.List;

public class OrderManager implements OrderService {

    private final IBaseRepository _baseRepository;

    public OrderManager(IBaseRepository baseRepository) {
        _baseRepository = baseRepository;
    }

    @Override
    public void add(Order order) {
        _baseRepository.orders().add(order);
    }

    @Override
    public List<String> getAll() {
        return null;
    }

    @Override
    public List<String> getAllByCustomerId(int id) {
        return null;
    }
}
