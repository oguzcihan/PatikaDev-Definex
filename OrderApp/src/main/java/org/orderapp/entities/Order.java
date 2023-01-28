package org.orderapp.entities;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Order extends BaseEntity implements Serializable {
    private int amount;
    private String name;
    private final LocalDate orderDate;
    private Long customerId;
    private Long companyId;
    private double price;

    public Order(Long id, int amount, String name, LocalDate orderDate, Long customerId, Long companyId, double price) {
        super(id);
        this.amount = amount;
        this.name = name;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.companyId = companyId;
        this.price = price;
    }
}
