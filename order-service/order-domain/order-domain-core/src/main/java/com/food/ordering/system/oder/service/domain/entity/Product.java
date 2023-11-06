package com.food.ordering.system.oder.service.domain.entity;

import com.food.odering.system.domain.valueobject.BaseId;
import com.food.odering.system.domain.valueobject.Monney;
import com.food.odering.system.domain.valueobject.ProductId;

public class Product extends BaseId<ProductId> {

    private ProductId id;
    private final String name;
    private final Monney price;

    public Product(ProductId productId, String name, Monney price) {
        super(productId);
        this.name = name;
        this.price = price;
    }

    public ProductId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Monney getPrice() {
        return price;
    }
}
