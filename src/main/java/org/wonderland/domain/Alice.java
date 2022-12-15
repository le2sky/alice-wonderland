package org.wonderland.domain;

public class Alice {

    private final Beverage beverage;
    private int height;
    private AliceLocation location;

    public Alice(int height, Beverage beverage) {
        validateHeight(height);
        this.height = height;
        this.beverage = beverage;
    }

    public void drinkBeverage() {
        final int quantity = 10;
        beverage.drunken(quantity);
        height -= quantity;
    }

    public void passDoor(Door door) {
        location = door.pass(height);
    }

    public void printLocation() {
        System.out.println("엘리스는 현재 " + location.getName() + "에 있습니다.");
    }

    private void validateHeight(int height) {
        if (0 == height)
            throw new ZeroHeight();
        if (0 > height)
            throw new NegativeHeight();
    }

    public static class ZeroHeight extends IllegalArgumentException {
    }

    public static class NegativeHeight extends IllegalArgumentException {
    }
}
