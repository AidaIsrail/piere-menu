package com.example.demo.bootstrap;

import com.example.demo.model.Category;
import com.example.demo.model.Item;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MainBootstrap implements ApplicationRunner {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ItemRepository itemRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {

            Category hotDrinks = new Category("hot drinks", "urljksagfqwf");
            categoryRepository.save(hotDrinks);

            Category desserts = new Category("desserts", "urljksagfqwf");
            categoryRepository.save(desserts);

            Category alcogol = new Category("alcogol", "urljksagfqwf");
            categoryRepository.save(alcogol);

            Item item1 = new Item("coffee", "coffee arabica", "250 ml", 120.0, "urlcoffee", hotDrinks, 0);
            Item item2 = new Item("tea", "tea", "250 ml", 50.0, "urltea", hotDrinks, 0);
            Item item3 = new Item("ice cream", "milk", "100 gr", 120.0, "urlicecream", desserts, 0);
            Item item4 = new Item("cake", "biscvit, cream", "125 gr", 195.0, "urlcake", desserts, 0);
            Item item5 = new Item("bear", "solod", "500 ml", 95.0, "urlbear", alcogol, 0);
            itemRepository.save(item1);
            itemRepository.save(item2);
            itemRepository.save(item3);
            itemRepository.save(item4);
            itemRepository.save(item5);
        }catch(Exception ex){
                System.out.println(ex.getMessage());
        }

    }
}

