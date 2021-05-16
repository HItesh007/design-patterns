package com.projects.designpatterns.creational.factory;

import com.projects.designpatterns.creational.enums.ShapeType;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This Unit test class demonstrates the usage of Factory pattern.
 */
public class FactoryPatternUnitTests {

    @Test(priority = 0, description = "Test case demonstrating Factory Pattern usage")
    public void usingShapeFactoryShouldReturnShapeTest() {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an Object of circle and draw
        Shape circleShape = shapeFactory.getShape(ShapeType.CIRCLE);

        // Draw circle
        circleShape.draw();

        // Get an object of Rectangle and Draw
        Shape rectangleShape = shapeFactory.getShape(ShapeType.RECTANGLE);

        // Draw Rectangle
        rectangleShape.draw();

        // Get an object of Square and draw
        Shape squareShape = shapeFactory.getShape(ShapeType.SQUARE);

        // draw Square
        squareShape.draw();

        System.out.println("\n" + circleShape);
        System.out.println("\n" + squareShape);
        System.out.println("\n" + rectangleShape);

        // Assert that circleShape object is instance of Circle & Shape
        assertThat(circleShape)
                .isInstanceOf(Circle.class)
                .isInstanceOf(Shape.class);

        // Assert that circleShape object is instance of Circle & Shape
        assertThat(squareShape)
                .isInstanceOf(Square.class)
                .isInstanceOf(Shape.class);

        // Assert that circleShape object is instance of Circle & Shape
        assertThat(rectangleShape)
                .isInstanceOf(Rectangle.class)
                .isInstanceOf(Shape.class);
    }
}
