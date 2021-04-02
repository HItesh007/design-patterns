package com.projects.designpatterns.creational.singleton;

import com.projects.utils.ConsoleUtils;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DBSingletonTests {

    @Test(priority = 0)
    public void instanceOfStaticSingletonClassShouldBeSame() {
        DBSingletonStatic instanceOne = DBSingletonStatic.getInstance();
        DBSingletonStatic instanceTwo = DBSingletonStatic.getInstance();

        // Print Instance values
        ConsoleUtils.println("Instance One Value : " + instanceOne);
        ConsoleUtils.println("Instance Two Value : " + instanceTwo);

        assertThat(instanceOne)
                .isEqualTo(instanceTwo)
                .isInstanceOf(DBSingletonStatic.class)
                .isNotNull();
    }

    @Test(priority = 1)
    public void instanceOfLazyLoadingSingletonClassShouldBeSame() {
        DBSingletonLazyLoading instanceOne = DBSingletonLazyLoading.getInstance();
        DBSingletonLazyLoading instanceTwo = DBSingletonLazyLoading.getInstance();

        // Print Instance values
        ConsoleUtils.println("Instance One Value : " + instanceOne);
        ConsoleUtils.println("Instance Two Value : " + instanceTwo);

        assertThat(instanceOne)
                .isEqualTo(instanceTwo)
                .isInstanceOf(DBSingletonLazyLoading.class)
                .isNotNull();
    }

    @Test(priority = 2)
    public void instanceOfThreadSafeSingletonClassShouldBeSame() {
        DBSingletonThreadSafe instanceOne = DBSingletonThreadSafe.getInstance();
        DBSingletonThreadSafe instanceTwo = DBSingletonThreadSafe.getInstance();

        // Print Instance values
        ConsoleUtils.println("Instance One Value : " + instanceOne);
        ConsoleUtils.println("Instance Two Value : " + instanceTwo);

        assertThat(instanceOne)
                .isEqualTo(instanceTwo)
                .isInstanceOf(DBSingletonThreadSafe.class)
                .isNotNull();
    }
}
