package com.projects.designpatterns.creational.builder;

import com.projects.designpatterns.creational.enums.*;
import org.apache.commons.math3.util.Precision;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class demonstrates the implementation of Builder pattern using static {@link Builder} class inside or main class.
 * This {@link Builder} class can be either created inside of the same class statically or can be created as a separate class file as well.
 */
public class SubwayBuilderPattern {
    private final Menu selectedMenu;
    private final int subQuantity;
    private final Preparation preparation;
    private final Breads breads;
    private final List<Sauce> sauce;
    private final List<Vegetables> vegetables;
    private final List<AddOns> addOns;
    private final List<Beverages> beverages;

    SubwayBuilderPattern(Builder builder) {
        this.selectedMenu = builder.selectedMenu;
        this.sauce = builder.sauce;
        this.vegetables = builder.vegetables;
        this.addOns = builder.addOns;
        this.beverages = builder.beverages;
        this.subQuantity = builder.subQuantity;
        this.preparation = builder.preparation;
        this.breads = builder.breads;
    }

    public int getSubQuantity() {
        return subQuantity;
    }

    public String getMenu() {
        return selectedMenu.toString();
    }

    public String getPreparation() {
        return preparation.toString();
    }

    public String getBreads() {
        return breads.toString();
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    public List<Sauce> getSauces() {
        return sauce;
    }

    public List<AddOns> getAddOns() {
        return addOns;
    }

    public List<Beverages> getBeverage() {
        return beverages;
    }

    public double getTotalBill() {
        if (selectedMenu == null) {
            throw new NullPointerException("Please select menu first before getting Total Price.");
        }

        double mainMenuPrice = selectedMenu.getPrice() * subQuantity;
        double addOnPrice = (addOns.stream().mapToDouble(AddOns::getAddOnPrice).sum()) * subQuantity * (selectedMenu.toString().contains("12_INCHES") ? 2 : 1);
        double beveragePrice = (beverages.stream().mapToDouble(Beverages::getPrice).sum()) * subQuantity;

        double totalBill = mainMenuPrice + addOnPrice + beveragePrice;
        double tax = (totalBill * 5) / 100;
        return Precision.round(totalBill + tax, 2);
    }

    public static class Builder {
        private final Menu selectedMenu;
        private final List<Sauce> sauce = new ArrayList<>();
        private final List<Vegetables> vegetables = new ArrayList<>();
        private final List<AddOns> addOns = new ArrayList<>();
        private final List<Beverages> beverages = new ArrayList<>();
        private final int subQuantity;
        private Preparation preparation;
        private Breads breads;

        Builder(Menu subMenu, int quantity) {
            this.selectedMenu = subMenu;
            this.subQuantity = quantity;

            if (this.subQuantity == 0) {
                throw new NullPointerException("Please select Quantity > 0");
            }
        }

        public SubwayBuilderPattern build() {
            return new SubwayBuilderPattern(this);
        }

        public Builder setSauce(Sauce sauceType) {
            this.sauce.add(sauceType);
            return this;
        }

        public Builder setBeverages(Beverages beveragesType) {
            this.beverages.add(beveragesType);
            return this;
        }

        public Builder setPreparation(Preparation preparationType) {
            this.preparation = preparationType;
            return this;
        }

        public Builder setBreads(Breads breadType) {
            this.breads = breadType;
            return this;
        }

        public Builder setVegetables(Vegetables vegetablesToInclude) {
            this.vegetables.add(vegetablesToInclude);
            return this;
        }

        public Builder setAddOns(AddOns subAddOns) {
            this.addOns.add(subAddOns);
            return this;
        }

    }
}
