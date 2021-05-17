package com.projects.designpatterns.creational.abstractFactory;

import com.projects.designpatterns.creational.factory.Shape;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class overrides the draw function of {@link Shape} to illustrate Abstract Factory Pattern
 */
public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I am inside RoundedRectangle::draw()");
    }
}