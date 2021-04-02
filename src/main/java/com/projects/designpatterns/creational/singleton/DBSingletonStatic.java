package com.projects.designpatterns.creational.singleton;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class is an example of Singleton pattern but in a Static way.
 */
public class DBSingletonStatic {
    private static final DBSingletonStatic instance = new DBSingletonStatic();

    private DBSingletonStatic() {
        // To Do
    }

    public static DBSingletonStatic getInstance() {
        return instance;
    }
}
