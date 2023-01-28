package org.orderapp.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Company extends BaseEntity{
    private String name;
    private String sector;

    public Company(Long id, String name, String sector) {
        super(id);
        this.name = name;
        this.sector = sector;
    }
}
