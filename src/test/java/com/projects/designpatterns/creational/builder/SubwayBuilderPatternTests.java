package com.projects.designpatterns.creational.builder;

import com.projects.designpatterns.creational.enums.*;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class SubwayBuilderPatternTests {

    @Test(priority = 0)
    public void createSubOrderUsingBuilderPatternTest() {
        SubwayBuilderPattern subwayBuilderPattern = new SubwayBuilderPattern
                .Builder(Menu.PERI_PERI_CHICKEN_SUB_6_INCHES, 2)
                .setBreads(Breads.MULTIGRAIN_HONEY_OATS_BREAD)
                .setPreparation(Preparation.TOASTED_BREAD_WITH_MOZZARELLA_CHEESE)
                .setVegetables(Vegetables.CAPSICUMS)
                .setVegetables(Vegetables.CUCUMBERS)
                .setVegetables(Vegetables.JALAPENOS)
                .setVegetables(Vegetables.ONIONS)
                .setSauce(Sauce.MAYONNAISE_SAUCE)
                .setSauce(Sauce.RED_CHILLI_SAUCE)
                .setSauce(Sauce.BARBEQUE_SAUCE)
                .setAddOns(AddOns.EGG)
                .setAddOns(AddOns.CHEESE_SLICE)
                .setBeverages(Beverages.PEPSI_BLACK_CAN_330_ML)
                .setBeverages(Beverages.LIPTON_LEMON_ICED_TEA_PET_BOTTLE_250_ML)
                .setBeverages(Beverages.PEPSI_CAN_330_ML)
                .build();

        // Print the Details
        System.out.println("----------------------------- Total Bill -----------------------------");
        System.out.println("Selected Menu : " + subwayBuilderPattern.getMenu());
        System.out.println("Bread : " + subwayBuilderPattern.getBreads());
        System.out.println("Preparation : " + subwayBuilderPattern.getPreparation());
        System.out.println("Sauces : ");
        subwayBuilderPattern.getSauces().forEach(s -> System.out.println("\t" + s.toString()));
        System.out.println("Vegetables : ");
        subwayBuilderPattern.getVegetables().forEach(v -> System.out.println("\t" + v.toString()));
        System.out.println("AddOns : ");
        subwayBuilderPattern.getAddOns().forEach(a -> System.out.println("\t" + a.toString()));
        System.out.println("Beverages : ");
        subwayBuilderPattern.getBeverage().forEach(b -> System.out.println("\t" + b.toString()));

        System.out.println("Total Bill : " + subwayBuilderPattern.getTotalBill());

        Assertions.assertThat(subwayBuilderPattern)
                .isNotNull()
                .isInstanceOf(SubwayBuilderPattern.class);

        Assertions.assertThat(subwayBuilderPattern.getTotalBill())
                .isInstanceOf(Double.class)
                .isGreaterThan(0);
    }
}
