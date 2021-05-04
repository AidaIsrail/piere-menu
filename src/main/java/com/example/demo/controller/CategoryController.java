package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.model.Item;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public Category create(@RequestBody Category category){
        return categoryService.create(category);
    }

    @PostMapping("/update")
    public Category update(@RequestBody Category category ){
        return categoryService.update(category);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id ){
        categoryService.delete(id);
        return "succesfully deleted!";
    }

       @GetMapping("/getAll")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
}