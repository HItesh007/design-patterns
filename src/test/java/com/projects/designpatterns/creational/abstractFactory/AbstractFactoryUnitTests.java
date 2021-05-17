package com.projects.designpatterns.creational.abstractFactory;

import com.projects.designpatterns.creational.abstractFactory.*;
import com.projects.designpatterns.creational.enums.ShapeType;
import com.projects.designpatterns.creational.factory.*;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This unit test class is created to demonstrate usage of Abstract Factory Pattern.
 */
public class AbstractFactoryUnitTests {

    @Test(priority = 0, description = "This unit test is created to demonstrate usage of Abstract Factory Pattern")
    public void shapeFactoryProducerShouldReturnShapeInstanceTest() {
        System.out.println("\n---------------- Following is an Example Using Normal Shapes ----------------\n");
        // Create object of Abstract Factory using Producer
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);

        // Get Shape using Object of AbstractFactory
        Shape squareShapeObj = abstractFactory.getShape(ShapeType.SQUARE);

        // Draw Shape
        squareShapeObj.draw();

        // Get Shape Object for Circle
        Shape circleShapeObj = abstractFactory.getShape(ShapeType.CIRCLE);

        // Draw Circle
        circleShapeObj.draw();

        // Get Shape Object of Rectangle
        Shape rectangleShapeObj = abstractFactory.getShape(ShapeType.RECTANGLE);

        // Draw Square
        rectangleShapeObj.draw();

        System.out.println("\n---------------- Following is an Example Using Normal Shapes ----------------\n");
        /// Get Rounded Abstract Factory And draw
        AbstractFactory roundedAbstractFactory = FactoryProducer.getFactory(true);

        // Get Shape Using Object of AbstractFactory
        Shape roundedSquareShapeObj = roundedAbstractFactory.getShape(ShapeType.SQUARE);

        // Draw Rounded Square
        roundedSquareShapeObj.draw();

        // Get Shape Using Object of Rounded Abstract Factory
        Shape roundedRectShapeObj = roundedAbstractFactory.getShape(ShapeType.RECTANGLE);

        // Draw Rounded Rectangle
        roundedRectShapeObj.draw();

        // Print all the objects
        System.out.println("\n---------------- Printing Object Values ----------------\n");
        System.out.println(abstractFactory);
        System.out.println(circleShapeObj);
        System.out.println(squareShapeObj);
        System.out.println(rectangleShapeObj);
        System.out.println(roundedAbstractFactory);
        System.out.println(roundedSquareShapeObj);
        System.out.println(roundedRectShapeObj);

        // Assert the object
        assertThat(abstractFactory)
                .isInstanceOf(AbstractFactory.class)
                .isInstanceOf(ShapeFactory.class)
                .isNotInstanceOf(RoundedShapeFactory.class);

        assertThat(circleShapeObj)
                .isInstanceOf(Circle.class)
                .isInstanceOf(Shape.class);

        assertThat(rectangleShapeObj)
                .isInstanceOf(Rectangle.class)
                .isInstanceOf(Shape.class);

        assertThat(squareShapeObj)
                .isInstanceOf(Square.class)
                .isInstanceOf(Shape.class);

        // Assert Object of Rounded Abstract Factory
        assertThat(roundedAbstractFactory)
                .isInstanceOf(RoundedShapeFactory.class)
                .isInstanceOf(AbstractFactory.class)
                .isNotInstanceOf(ShapeFactory.class);

        assertThat(roundedRectShapeObj)
                .isInstanceOf(RoundedRectangle.class)
                .isInstanceOf(Shape.class);

        assertThat(roundedSquareShapeObj)
                .isInstanceOf(RoundedSquare.class)
                .isInstanceOf(Shape.class);
    }
}
