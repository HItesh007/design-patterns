package com.projects.designpatterns.creational.enums;

public enum AddOns {
    CHEESE_SLICE(20),
    MOZZARELLA_CHEESE(25),
    DOUBLE_MEAT(65),
    EGG(35);

    private final double addOnPrice;

    AddOns(double addOnPrice) {
        this.addOnPrice = addOnPrice;
    }

    public double getAddOnPrice() {
        return this.addOnPrice;
    }
}
