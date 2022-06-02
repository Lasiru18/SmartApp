package com.smartApp.service;

import com.smartApp.entities.Item;
import com.smartApp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void saveItem(Item item){
        itemRepository.save(item);
    }

    public Optional<Item> findById(Long itemId){
        var item = itemRepository.findById(itemId);
        return item;
    }


    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    //Call to ItemRepository
    public Optional<Item> updateItem(Long ItemId, Item updatedItem){
        return this.itemRepository.findById(ItemId).map(oldItem -> this.itemRepository.save(updatedItem));
    }

    public void deleteItem(Long item){
        itemRepository.deleteById(item);
    }

}
