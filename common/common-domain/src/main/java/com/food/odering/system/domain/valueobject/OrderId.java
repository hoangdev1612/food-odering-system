package com.food.odering.system.domain.valueobject;

import java.util.UUID;

public class OrderId extends BaseId<UUID> {
    public OrderId(UUID value) {
        super(value);
    }
}
