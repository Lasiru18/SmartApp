package com.smartApp.repository;

import com.smartApp.entities.StockItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockItemRepository extends JpaRepository<StockItem, Long> {

    StockItem save(StockItem stockItem);
    StockItem findById(StockItem stockItem);
    public List<StockItem> findAll();
    StockItem deleteById(StockItem stockItem);

}
