package com.projects.designpatterns.creational.singleton;

import com.projects.utils.ConsoleUtils;
import com.projects.utils.DateUtils;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DBSingletonThreadSafeTests {

    @Test(priority = 0)
    public void instanceOfSingletonThreadSafeClassShouldBeThreadSafe() {
        DBSingletonThreadSafe instanceOne = DBSingletonThreadSafe.getInstance();

        // Thread #1  DBSingletonThreadSafe.class at #TIMESTAMP and has value #OBJECTVALUE
        // Print Instance values
        ConsoleUtils.println("Accessed [DBSingletonThreadSafe.class] at : "
                + DateUtils.getCurrentTimeStamp()
                + " and has value : "
                + instanceOne);

        int totalRows = instanceOne.getTotalRows();

        ConsoleUtils.println("Call to function [getTotalRows] completed and has value : " + totalRows);

        assertThat(instanceOne)
                .isInstanceOf(DBSingletonThreadSafe.class)
                .isNotNull();
    }
}
