package org.orderapp.entities;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Customer extends BaseEntity implements Serializable {
    private String firstname;
    private String lastname;
    private final LocalDate registerDate;

    public Customer(Long id, String firstname, String lastname, LocalDate registerDate) {
        super(id);
        this.firstname = firstname;
        this.lastname = lastname;
        this.registerDate = registerDate;
    }
}
