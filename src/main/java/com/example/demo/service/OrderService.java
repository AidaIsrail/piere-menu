package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Order;

import java.util.List;
import java.util.Set;

public interface OrderService {
    Order create (Order order);
    Order update (Order order);
    Order getOrderById(Long id);
    void delete (Long id);
    Set<Order> getAll();

}
