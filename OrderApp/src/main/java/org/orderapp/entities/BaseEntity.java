package org.orderapp.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class BaseEntity {
    private Long id;
    private LocalDate transactionDate=LocalDate.now();

    public BaseEntity(Long id) {
        this.id = id;
    }
}
