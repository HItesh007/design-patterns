package com.projects.designpatterns.creational.enums;

public enum Menu {
    PANEER_TIKKA_SUB_6_INCHES(196),
    PANEER_TIKKA_SUB_12_INCHES(364),
    PERI_PERI_CHICKEN_SUB_6_INCHES(201),
    PERI_PERI_CHICKEN_SUB_12_INCHES(379),
    TANDOORI_TOFU_SUB_6_INCHES(196),
    TANDOORI_TOFU_SUB_12_INCHES(364);

    private final double basePrice;

    Menu(double price) {
        this.basePrice = price;
    }

    public double getPrice() {
        return basePrice;
    }
}
