package com.smartApp.repository;

import com.smartApp.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Item save(Item item);
    Item findById(Item item);
    public List<Item> findAll();
    Item deleteById(Item item);


}
