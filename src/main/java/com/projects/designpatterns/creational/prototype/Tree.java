package com.projects.designpatterns.creational.prototype;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class demonstrates the use of Prototype pattern without using {@link Cloneable}.
 *
 * <pre>For the implementation, let's consider following scenario.
 *
 * In some games, we want trees or buildings in the background.
 * We may realize that we don't have to create new trees or buildings and render them on the screen every time the character moves.
 * So, we create an instance of the tree first.
 * Then we can create as many trees as we want from this instance (prototype) and update their positions.
 * We may also choose to change the color of the trees for a new level in the game.
 * </pre>
 */
public class Tree implements Cloneable {

    private double mass;
    private double height;
    private Position position;

    public Tree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Tree [mass=" + mass + ", height=" + height + ", position=" + position + "]";
    }

    @Override
    protected Tree clone() {
        try {
            return (Tree) super.clone();
        } catch (CloneNotSupportedException cEx) {
            return new Tree(this.mass, this.height);
        }
    }

    // Interface of Copy/clone
    //public abstract Tree copy();
}
