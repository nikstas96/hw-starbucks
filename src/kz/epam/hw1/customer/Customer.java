package kz.epam.hw1.customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите имя:");
            this.name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(){}
}
