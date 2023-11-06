package com.food.odering.system.domain.valueobject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Monney {
    private final BigDecimal amount;

    public Monney(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public boolean isGreaterThanZero() {
        return this.amount != null && this.amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreaterThan(Monney monney) {
        return this.amount != null && this.amount.compareTo(monney.getAmount()) > 0;
    }

    public Monney add(Monney monney) {
        return new Monney(setScale(this.amount.add(monney.getAmount())));
    }

    public Monney subtract(Monney monney) {
        return new Monney(setScale(this.amount.subtract(monney.getAmount())));
    }

    public Monney multiply(int multiplier) {
        return new Monney(setScale(this.amount.multiply(new BigDecimal(multiplier))));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monney monney = (Monney) o;
        return amount.equals(monney.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    private BigDecimal setScale(BigDecimal input) {
        return input.setScale(2, RoundingMode.HALF_EVEN);
    }
}
