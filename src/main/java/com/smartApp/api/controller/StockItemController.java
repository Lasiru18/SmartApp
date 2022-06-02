package com.smartApp.api.controller;

import com.smartApp.entities.StockItem;
import com.smartApp.service.StockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stockItem")

public class StockItemController {

    @Autowired
    private StockItemService stockItemService;

    @PostMapping("/add")
    public void newStockItem(@RequestBody StockItem stockItem){
        stockItemService.saveStockItem(stockItem);
    }

    @GetMapping("/{itemId}")
    public Optional<StockItem> findStockItem(@PathVariable("stockItemId") Long stockItemId, @PathVariable String itemId) {
        //call to service
        var stockItem = stockItemService.findById(stockItemId);
        return stockItem;
    }


    @GetMapping
    public List<StockItem> getStockItems() {
        return stockItemService.getStockItems();
    }

    @PutMapping("/{stockItemId}")
    public Optional<StockItem> updateStockItem(@PathVariable("stockItemId") Long stockItemId, @RequestBody StockItem updatedStockItem) {
        //call to service
        return stockItemService.updateStockItem(stockItemId, updatedStockItem);
    }

    @DeleteMapping("/d/{stockItemId}")
    public void deleteStockItem(@PathVariable("stockItemId") Long stockItemId){
        stockItemService.deleteStockItem(stockItemId);
    }

}
