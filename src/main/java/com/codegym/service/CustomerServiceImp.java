package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImp implements CustomerService {

    private static Map<Integer,Customer> customers;

    static {
        customers=new HashMap<>();
        customers.put(1,new Customer(1,"Thinh1","thinh1@gmail.com","Vinh Phuc 1"));
        customers.put(2,new Customer(2,"Thinh2","thinh2@gmail.com","Vinh Phuc 2"));
        customers.put(3,new Customer(3,"Thinh3","thinh3@gmail.com","Vinh Phuc 3"));
        customers.put(4,new Customer(4,"Thinh4","thinh4@gmail.com","Vinh Phuc 4"));
        customers.put(5,new Customer(5,"Thinh5","thinh5@gmail.com","Vinh Phuc 5"));
        customers.put(6,new Customer(6,"Thinh6","thinh6@gmail.com","Vinh Phuc 6"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
