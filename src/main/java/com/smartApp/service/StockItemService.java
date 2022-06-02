package com.smartApp.service;

import com.smartApp.entities.StockItem;
import com.smartApp.repository.StockItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockItemService {

    @Autowired
    private StockItemRepository stockItemRepository;

    public void saveStockItem(StockItem stockItem){
        stockItemRepository.save(stockItem);
    }

    public Optional<StockItem> findById(Long stockItemId){
        var stockItem = stockItemRepository.findById(stockItemId);
        return stockItem;
    }


    public List<StockItem> getStockItems() {
        return stockItemRepository.findAll();
    }

    //Call to ItemRepository
    public Optional<StockItem> updateStockItem(Long StockItemId, StockItem updatedStockItem){
        return this.stockItemRepository.findById(StockItemId).map(oldStockItem -> this.stockItemRepository.save(updatedStockItem));
    }

    public void deleteStockItem(Long stockItem){
        stockItemRepository.deleteById(stockItem);
    }

}
