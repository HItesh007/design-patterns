package com.projects.designpatterns.creational.prototype;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class TreePrototypeUnitTests {
    // Define Mass & Height
    private final double MASS = 10.0;
    private final double HEIGHT = 3.7;

    @Test(priority = 0)
    public void givenAPlasticTreePrototypeWhenClonedThenCreateA_Clone() throws CloneNotSupportedException {

        // Set Position for 1st & 2nd Plastic Tre
        Position firstPlasticTreePosition = new Position(10, 0);
        Position secondPlasticTreePosition = new Position(20, 0);

        // Create 1st Plastic Tree
        PlasticTree firstPlasticTree = new PlasticTree(MASS, HEIGHT);
        firstPlasticTree.setPosition(firstPlasticTreePosition);

        // Create 2nd Plastic Tree by cloning 1st one
        PlasticTree secondPlasticTree = (PlasticTree) firstPlasticTree.clone();
        secondPlasticTree.setPosition(secondPlasticTreePosition);

        // Print Both Plastic Tree
        System.out.println(firstPlasticTree);
        System.out.println(secondPlasticTree);


        // Assert that position of 1st & 2nd plastic tree is equal to what was set initially
        assertThat(firstPlasticTreePosition)
                .isEqualTo(firstPlasticTree.getPosition());

        assertThat(secondPlasticTreePosition)
                .isEqualTo(secondPlasticTree.getPosition());
    }

    @Test(priority = 1)
    public void givenAPineTreePrototypeWhenClonedThenCreateA_Clone() {
        Position firstPineTreePosition = new Position(15, 0);
        Position secondPineTreePosition = new Position(20, 0);

        // Create 1st Pine Tree & Set it's position
        PineTree firstPineTree = new PineTree(MASS, HEIGHT);
        firstPineTree.setPosition(firstPineTreePosition);

        // Create 2nd Pine Tree by cloning the object of 1st Pine Tree. Update it's position
        PineTree secondPineTree = (PineTree) firstPineTree.clone();
        secondPineTree.setPosition(secondPineTreePosition);

        System.out.println("First Pine Tree Details : " + firstPineTree);
        System.out.println("Second Pine Tree Details : " + secondPineTree);

        // Assert that the position of 1st & 2nd Pine tree is equal to what was set earlier
        assertThat(firstPineTree.getPosition())
                .isEqualTo(firstPineTreePosition);

        assertThat(secondPineTree.getPosition())
                .isEqualTo(secondPineTreePosition);
    }

    @Test(priority = 2)
    public void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {
        // Set the position at which to plot the tress
        Position plasticTreePosition = new Position(20, 0);
        Position pineTreePosition = new Position(35, 0);

        // Create Plastic Tree & Set it's position
        PlasticTree plasticTree = new PlasticTree(MASS, HEIGHT);
        plasticTree.setPosition(plasticTreePosition);

        // Create Pine Tree & Set It's position
        PineTree pineTree = new PineTree(MASS, HEIGHT);
        pineTree.setPosition(pineTreePosition);

        // Store Created Plastic Tree & Pine Tree as a List of Trees
        List<Tree> trees = Arrays.asList(plasticTree, pineTree);

        // Create a clone from Initial Objects of Plastic Tree and Pine Tree and store into a new list of Tree
        List<Tree> treeClones = trees.stream().map(Tree::clone).collect(Collectors.toList());

        // Get the Plastic Tree Object from Clones list
        Tree plasticTreeClone = treeClones.get(0);

        // Assert that Mass, Height & Position of the cloned Plastic Tree is equal to Original value set
        assertThat(plasticTreeClone.getMass())
                .isEqualTo(MASS);
        assertThat(plasticTreeClone.getHeight())
                .isEqualTo(HEIGHT);
        assertThat(plasticTreeClone.getPosition())
                .isEqualTo(plasticTreePosition);
    }
}
