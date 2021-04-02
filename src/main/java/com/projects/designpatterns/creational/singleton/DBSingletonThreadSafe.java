package com.projects.designpatterns.creational.singleton;

import com.github.javafaker.Faker;

/**
 * @author Hitesh Prajapati
 * @version 1.0
 * @implNote This class is a thread safe version of singleton pattern
 */
public class DBSingletonThreadSafe {
    private static DBSingletonThreadSafe instance = null;

    private DBSingletonThreadSafe() {
        // Below code is added to ensure that no one can call or use this constructor
        // using Reflection APIs
        if (instance != null) {
            throw new RuntimeException("Please use getInstance method to create");
        }
    }

    public static DBSingletonThreadSafe getInstance() {
        if (instance == null) {
            // This block is to make sure that the thread safety is handled.
            // This is useful when one thread has already acquired this instance and another thread
            // is trying to access it then it thread one locks this instance and makes the thread two to wait until
            // it has release the lock on this instance.
            synchronized (DBSingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new DBSingletonThreadSafe();
                }
            }
        }
        return instance;
    }

    public int getTotalRows() {
        int randomRows = 0;
        try {
            Faker faker = new Faker();
            Thread.sleep(faker.number().numberBetween(5000, 10000));
            randomRows = new Faker().number().numberBetween(100, 1000);
        } catch (InterruptedException ignored) {
        }
        return randomRows;
    }
}
