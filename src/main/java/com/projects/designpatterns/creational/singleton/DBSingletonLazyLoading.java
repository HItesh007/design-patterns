package com.projects.designpatterns.creational.singleton;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class is created of type singleton pattern having lazy loading
 */
public class DBSingletonLazyLoading {
    private static DBSingletonLazyLoading instance = null;

    private DBSingletonLazyLoading() {
        // To Do
    }

    public static DBSingletonLazyLoading getInstance() {
        if (instance == null) {
            instance = new DBSingletonLazyLoading();
        }
        return instance;
    }
}
