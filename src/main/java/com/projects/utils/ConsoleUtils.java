package com.projects.utils;

public class ConsoleUtils {

    public static void println(Object message) {
        String logMessage = "["
                .concat(DateUtils.getCurrentTimeStampWithFormatAs("dd-MM-yyyy HH.mm.ss.SSS"))
                .concat(" | ")
                .concat("Thread#")
                .concat(String.valueOf(Thread.currentThread().getId()))
                .concat("] - ")
                .concat(String.valueOf(message));

        System.out.println(logMessage);
    }

    public static void print(Object message) {
        String logMessage = "["
                .concat(DateUtils.getCurrentTimeStampWithFormatAs("dd-MM-yyyy HH.mm.ss.SSS"))
                .concat(" | ")
                .concat("Thread#")
                .concat(String.valueOf(Thread.currentThread().getId()))
                .concat("] - ")
                .concat(String.valueOf(message));

        System.out.print(message);
    }
}
