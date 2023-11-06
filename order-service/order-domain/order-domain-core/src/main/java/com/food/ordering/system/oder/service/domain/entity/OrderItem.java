package com.food.ordering.system.oder.service.domain.entity;

import com.food.odering.system.domain.entity.BaseEntity;
import com.food.odering.system.domain.valueobject.Monney;
import com.food.odering.system.domain.valueobject.OrderId;
import com.food.ordering.system.oder.service.domain.valueobject.OrderItemId;

import java.util.UUID;

public class OrderItem extends BaseEntity<OrderItemId> {
    private OrderId orderId;
    private final Product product;
    private final int quantity;
    private final Monney price;
    private final Monney subTotal;

    private OrderItem(Builder builder) {
        super.setId(builder.orderItemId);
        product = builder.product;
        quantity = builder.quantity;
        price = builder.price;
        subTotal = builder.subTotal;
    }


    public OrderId getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Monney getPrice() {
        return price;
    }

    public Monney getSubTotal() {
        return subTotal;
    }

    public void initializeOrderItem(OrderId orderId, OrderItemId orderItemId) {
        this.orderId = orderId;
        super.setId(orderItemId);
    }

    boolean isPriceValid() {
        return price.isGreaterThanZero() &&
                price.equals(product.getPrice()) &&
                price.multiply(quantity).equals(subTotal);
    }

    public static final class Builder {
        private OrderItemId orderItemId;
        private Product product;
        private int quantity;
        private Monney price;
        private Monney subTotal;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder orderItemId(OrderItemId val) {
            orderItemId = val;
            return this;
        }

        public Builder product(Product val) {
            product = val;
            return this;
        }

        public Builder quantity(int val) {
            quantity = val;
            return this;
        }

        public Builder price(Monney val) {
            price = val;
            return this;
        }

        public Builder subTotal(Monney val) {
            subTotal = val;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }
}
