package com.projects.designpatterns.creational.factory;

import com.projects.designpatterns.creational.abstractFactory.AbstractFactory;
import com.projects.designpatterns.creational.enums.ShapeType;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This a an actual factory class implementation. Using this class, Objects of various implementation
 * of Factory/Overridden method is called.
 *
 * <pre>Note : This class extends {@link AbstractFactory}. And this extension is to demonstrate Abstract Factory pattern.
 * </pre>
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
