package com.example.demo.service;



import com.example.demo.model.Item;

import java.util.List;

public interface ItemService {

    Item create (Item item);
    Item update (Item item);
    void delete (Long id);
    List<Item> getByCategory(String name);
    List<Item> getAll();
}
