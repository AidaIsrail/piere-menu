package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;
    @Override
    public Item create(Item item) {
        return  itemRepository.save(item);
    }

    @Override
    public Item update(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void delete(Long id) {
        itemRepository.deleteById(id);
    }
    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    @Override
    public List<Item> getByCategory(String category) {
        return itemRepository.findAll()
                .stream()
                .filter( x -> {
                    return x.getCategory().equals(category);
                })
                .collect(Collectors.toList());
    }
}
