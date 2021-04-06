package com.projects.designpatterns.creational.builder;

import com.projects.designpatterns.creational.enums.*;
import org.apache.commons.math3.util.Precision;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class is representation of Java Bean pattern which makes
 * use of Getter and Setter to Set and get values.
 */
public class SubwayJavaBeanPattern {

    private final Menu selectedMenu;
    private final List<Sauce> sauce = new ArrayList<>();
    private final List<Vegetables> vegetables = new ArrayList<>();
    private final List<AddOns> addOns = new ArrayList<>();
    private final List<Beverages> beverages = new ArrayList<>();
    private final int subQuantity;
    private Preparation preparation;
    private Breads breads;

    SubwayJavaBeanPattern(Menu menu, int quantity) {
        this.selectedMenu = menu;
        this.subQuantity = quantity;

        if (this.subQuantity == 0) {
            throw new NullPointerException("Please select Quantity > 0");
        }
    }

    public int getSubQuantity() {
        return subQuantity;
    }

    public void setSauce(Sauce sauceType) {
        this.sauce.add(sauceType);
    }

    public void setBeverages(Beverages beveragesType) {
        this.beverages.add(beveragesType);
    }

    public String getMenu() {
        return selectedMenu.toString();
    }

    public String getPreparation() {
        return preparation.toString();
    }

    public void setPreparation(Preparation preparationType) {
        this.preparation = preparationType;
    }

    public String getBreads() {
        return breads.toString();
    }

    public void setBreads(Breads breadType) {
        this.breads = breadType;
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetables vegetablesToInclude) {
        this.vegetables.add(vegetablesToInclude);
    }

    public List<Sauce> getSauces() {
        return sauce;
    }

    public List<AddOns> getAddOns() {
        return addOns;
    }

    public void setAddOns(AddOns subAddOns) {
        this.addOns.add(subAddOns);
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

}
