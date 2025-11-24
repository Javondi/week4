package com.logger;

public class SpacedLogger implements Logger {

    private String addSpaces(String message) {
        return String.join(" ", message.split(""));
    }

    @Override
    public void log(String message) {
        System.out.println(addSpaces(message));
    }

    @Override
    public void error(String message) {
        System.out.println(addSpaces("ERROR: " + message));
    }
}
