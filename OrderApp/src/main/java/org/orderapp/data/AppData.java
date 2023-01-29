package org.orderapp.data;

import lombok.NoArgsConstructor;
import org.orderapp.business.abstracts.CustomerService;
import org.orderapp.business.concretes.CustomerManager;
import org.orderapp.data.repositories.concretes.BaseRepository;
import org.orderapp.entities.Company;
import org.orderapp.entities.Customer;
import org.orderapp.entities.Order;

import java.time.LocalDate;

public class AppData {

    private final CustomerService _customerService;

    public AppData() {
        this(new CustomerManager(new BaseRepository()));
    }

    public AppData(CustomerService customerService) {
        _customerService = customerService;
    }

    Company companyOne = new Company(1L, "A", "Yazılım");
    Company companyTwo = new Company(2L, "B", "Bilişim");
    Company companyThree = new Company(3L, "C", "IT");

    Customer customerOne = new Customer(1L, "Oğuz", "Cihan", LocalDate.now());
    Customer customerTwo = new Customer(2L, "Ali", "Veli", LocalDate.of(2022, 8, 7));
    Customer customerThree = new Customer(3L, "Veli", "Ali", LocalDate.now());

    Order orderOne = new Order(1L, 123, "Saat", LocalDate.of(2023, 1, 10), customerOne.getId(), companyOne.getId(), 6000);
    Order orderTwo = new Order(2L, 12, "Kalem", LocalDate.now(), customerTwo.getId(), companyOne.getId(), 55);
    Order orderThree = new Order(3L, 134, "Defter", LocalDate.now(), customerTwo.getId(), companyTwo.getId(), 1501);
    Order orderFour = new Order(3L, 13, "Silgi", LocalDate.now(), customerThree.getId(), companyThree.getId(), 1601);

    public void addCustomer() {
        _customerService.add(customerOne);
        _customerService.add(customerTwo);
        _customerService.add(customerThree);
    }

}
