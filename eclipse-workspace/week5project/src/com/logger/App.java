package com.logger;

public class App {
    public static void main(String[] args) {

        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test AsteriskLogger
        asteriskLogger.log("Hello");
        asteriskLogger.error("Something went wrong");

        System.out.println(); 

        // Test SpacedLogger
        spacedLogger.log("Hello");
        spacedLogger.error("Something went wrong");
    }
}
