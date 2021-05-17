package com.projects.designpatterns.creational.abstractFactory;

import com.projects.designpatterns.creational.enums.ShapeType;
import com.projects.designpatterns.creational.factory.Circle;
import com.projects.designpatterns.creational.factory.Shape;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class is a representation of Factory of factories for Abstract Factory pattern.
 * It returns {@link Shape} Object based on the {@link ShapeType}
 */
public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new RoundedSquare();
            case RECTANGLE -> new RoundedRectangle();
        };
    }
}