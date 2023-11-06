package com.food.ordering.system.oder.service.domain.entity;

import com.food.odering.system.domain.entity.AggregateRoot;
import com.food.odering.system.domain.valueobject.CustomerId;
import com.food.odering.system.domain.valueobject.Monney;
import com.food.odering.system.domain.valueobject.RestaurantId;
import com.food.odering.system.domain.valueobject.OrderId;
import com.food.ordering.system.oder.service.domain.valueobject.StreetAddress;

public class Order extends AggregateRoot<OrderId> {
    private final CustomerId customerId;
    private final RestaurantId restaurentId;
    private final StreetAddress deliveryAddress;
    private final Monney price;
    private final List<OrderItem> items;

}
