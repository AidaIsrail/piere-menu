package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/item")

public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/create")
    public Item create(@RequestBody Item item ){
        return itemService.create(item);
    }

    @PostMapping("/update")
    public Item update(@RequestBody Item item ){
        return itemService.update(item);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id ){
        itemService.delete(id);
        return "succesfully deleted!";
    }

    @GetMapping("/getByCategory/{category}")
    public List<Item> getByCategory(@PathVariable String category){
        return itemService.getByCategory(category);
    }

    @GetMapping("/getAll")
    public List<Item> getAll(){
        return itemService.getAll();
    }
}