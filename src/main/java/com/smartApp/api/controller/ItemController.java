package com.smartApp.api.controller;

import com.smartApp.entities.Item;
import com.smartApp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/add")
    public void newItem(@RequestBody Item item){
        itemService.saveItem(item);
    }

    @GetMapping("/{itemId}")
    public Optional<Item> findItem(@PathVariable("itemId") Long itemId) {
        //call to service
        var item = itemService.findById(itemId);
        return item;
    }


    @GetMapping
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @PutMapping("/{itemId}")
    public Optional<Item> updateItem(@PathVariable("itemId") Long itemId, @RequestBody Item updatedItem) {
        //call to service
        return itemService.updateItem(itemId, updatedItem);
    }

    @DeleteMapping("/d/{itemId}")
    public void deleteItem(@PathVariable("itemId") Long itemId){
        itemService.deleteItem(itemId);
    }


}
