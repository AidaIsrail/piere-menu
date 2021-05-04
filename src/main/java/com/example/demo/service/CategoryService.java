package com.example.demo.service;

import com.example.demo.model.Category;

import java.util.List;

public interface CategoryService {
    Category create (Category category);
    Category update (Category category);
    void delete (Long id);
    List<Category> getAll();
}

