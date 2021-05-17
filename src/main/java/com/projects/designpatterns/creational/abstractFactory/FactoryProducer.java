package com.projects.designpatterns.creational.abstractFactory;

import com.projects.designpatterns.creational.factory.ShapeFactory;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class is created to return {@link AbstractFactory} of type {@link RoundedShapeFactory}
 * or {@link ShapeFactory}
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isRoundedFactory) {
        if (isRoundedFactory) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}