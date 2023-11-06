package com.food.ordering.system.oder.service.domain.valueobject;

import com.food.odering.system.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
