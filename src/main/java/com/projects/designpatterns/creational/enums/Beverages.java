package com.projects.designpatterns.creational.enums;

public enum Beverages {
    AQUAVESS_WATER_PET_BOTTLE_500_ML(57.14),
    LIPTON_LEMON_ICED_TEA_PET_BOTTLE_250_ML(47.14),
    MIRINDA_CAN_330_ML(57.14),
    MIRINDA_PET_BOTTLE_500_ML(57.14),
    PEPSI_BLACK_CAN_330_ML(57.14),
    PEPSI_CAN_330_ML(57.14),
    SEVEN_UP_CAN_330_ML(57.14),
    SEVEN_UP_NIMBOOZ_PET_BOTTLE_250_ML(47.14),
    SEVEN_UP_PET_BOTTLE_500_ML(57.14),
    SLICE_PET_BOTTLE_350_ML(47.14);

    private final double price;

    Beverages(double beveragePrice) {
        this.price = beveragePrice;
    }

    public double getPrice() {
        return price;
    }
}
