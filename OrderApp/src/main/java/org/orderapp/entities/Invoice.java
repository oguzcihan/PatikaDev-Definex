package org.orderapp.entities;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Invoice extends BaseEntity implements Serializable {
    private double price;
    private Order order;
    private LocalDate invoiceDate;
    private String description;

    public Invoice(Long id, double price, Order order, LocalDate invoiceDate, String description) {
        super(id);
        this.price = price;
        this.order = order;
        this.invoiceDate = invoiceDate;
        this.description = description;
    }
}
