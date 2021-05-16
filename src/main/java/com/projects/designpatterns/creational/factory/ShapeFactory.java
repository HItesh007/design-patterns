package com.projects.designpatterns.creational.factory;

import com.projects.designpatterns.creational.enums.ShapeType;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This a an actual factory class implementation. Using this class, Objects of various implementation
 * of Factory/Overridden method is called.
 */
public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
