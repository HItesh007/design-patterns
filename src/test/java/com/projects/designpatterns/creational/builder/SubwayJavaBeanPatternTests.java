package com.projects.designpatterns.creational.builder;

import com.projects.designpatterns.creational.enums.*;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class SubwayJavaBeanPatternTests {

    @Test(priority = 0)
    public void prepareSubOrderAndGetTotalPriceTest() {
        SubwayJavaBeanPattern subwayJavaBeanPattern = new SubwayJavaBeanPattern(Menu.PERI_PERI_CHICKEN_SUB_12_INCHES, 3);

        // Set Bread Type
        subwayJavaBeanPattern.setBreads(Breads.MULTIGRAIN_HONEY_OATS_BREAD);

        // Set Sauces
        subwayJavaBeanPattern.setSauce(Sauce.BARBEQUE_SAUCE);
        subwayJavaBeanPattern.setSauce(Sauce.HONEY_MUSTARD_SAUCE);
        subwayJavaBeanPattern.setSauce(Sauce.CHIPOTLE_SOUTH_WEST_SAUCE);

        // Set Preparation
        subwayJavaBeanPattern.setPreparation(Preparation.TOASTED_BREAD_WITH_MOZZARELLA_CHEESE);

        // Set Vegetables
        subwayJavaBeanPattern.setVegetables(Vegetables.CAPSICUMS);
        subwayJavaBeanPattern.setVegetables(Vegetables.JALAPENOS);
        subwayJavaBeanPattern.setVegetables(Vegetables.CUCUMBERS);
        subwayJavaBeanPattern.setVegetables(Vegetables.ONIONS);

        // Set AddOns
        subwayJavaBeanPattern.setAddOns(AddOns.CHEESE_SLICE);
        subwayJavaBeanPattern.setAddOns(AddOns.EGG);

        // Set Beverages
        subwayJavaBeanPattern.setBeverages(Beverages.SEVEN_UP_CAN_330_ML);
        subwayJavaBeanPattern.setBeverages(Beverages.PEPSI_BLACK_CAN_330_ML);
        subwayJavaBeanPattern.setBeverages(Beverages.SLICE_PET_BOTTLE_350_ML);

        // Print the Details
        System.out.println("----------------------------- Total Bill -----------------------------");
        System.out.println("Selected Menu : " + subwayJavaBeanPattern.getMenu());
        System.out.println("Bread : " + subwayJavaBeanPattern.getBreads());
        System.out.println("Preparation : " + subwayJavaBeanPattern.getPreparation());
        System.out.println("Sauces : ");
        subwayJavaBeanPattern.getSauces().forEach(s -> System.out.println("\t" + s.toString()));
        System.out.println("Vegetables : ");
        subwayJavaBeanPattern.getVegetables().forEach(v -> System.out.println("\t" + v.toString()));
        System.out.println("AddOns : ");
        subwayJavaBeanPattern.getAddOns().forEach(a -> System.out.println("\t" + a.toString()));
        System.out.println("Beverages : ");
        subwayJavaBeanPattern.getBeverage().forEach(b -> System.out.println("\t" + b.toString()));

        System.out.println("Total Bill : " + subwayJavaBeanPattern.getTotalBill());

        Assertions.assertThat(subwayJavaBeanPattern.getTotalBill())
                .isInstanceOf(Double.class)
                .isGreaterThan(0);
    }
}
