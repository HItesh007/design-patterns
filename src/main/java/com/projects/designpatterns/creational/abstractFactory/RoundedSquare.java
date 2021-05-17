package com.projects.designpatterns.creational.abstractFactory;

import com.projects.designpatterns.creational.factory.Shape;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class is created to show implementation of Draw function having rounded properties for Abstract
 * Factory pattern
 */
public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("I am inside RoundedSquare::draw()");
    }
}