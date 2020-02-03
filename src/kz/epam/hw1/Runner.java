package kz.epam.hw1;

import kz.epam.hw1.customer.Customer;
import kz.epam.hw1.starbucks.order.Order;

public class Runner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName();
        System.out.println(customer.getName());
        Order order = new Order();
        order.makeOrder();
    }
}
