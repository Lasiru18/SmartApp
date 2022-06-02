package com.smartApp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table

public class StockItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "_item_code")
    private String itemCode;

    @Column(name = "_stock_batch")
    private String stockBatch;

    @Column(name = "_added_quantity")
    private String addedQuantity;

    @Column(name = "_1_item_price")
    private String itemPrice;

}
