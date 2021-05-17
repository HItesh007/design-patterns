package com.projects.designpatterns.creational.abstractFactory;

import com.projects.designpatterns.creational.enums.ShapeType;
import com.projects.designpatterns.creational.factory.Shape;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class is representation of Abstract Factory Pattern. This class is added
 * to return appropriate {@link Shape} Object based on {@link ShapeType} provided. The implementation of
 * <code>getShape</code> is done by it's child classes {@link com.projects.designpatterns.creational.factory.ShapeFactory}
 * and {@link RoundedShapeFactory}
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType shapeType);
}