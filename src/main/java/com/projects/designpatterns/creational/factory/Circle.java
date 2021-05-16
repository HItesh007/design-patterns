package com.projects.designpatterns.creational.factory;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class implements {@link Shape} interface. This is to demonstrate Factory pattern.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I am inside Circle::draw()");
    }
}
