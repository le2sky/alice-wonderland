package org.wonderland.domain;

public class Beverage {

    private int amount;

    public void drunken(int quantity) {
        validateZeroAmount();
        decreaseAmount(quantity);
    }

    private void decreaseAmount(int quantity) {
        amount -= quantity;
        if (0 > amount)
            amount = 0;
    }

    private void validateZeroAmount() {
        if (0 >= amount)
            throw new ZeroAmount();
    }

    public static class ZeroAmount extends IllegalArgumentException {
    }
}
