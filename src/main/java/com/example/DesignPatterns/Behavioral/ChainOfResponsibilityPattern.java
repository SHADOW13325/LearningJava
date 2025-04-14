package com.example.DesignPatterns.Behavioral;

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        Logger logger = new DebugLogger(new InfoLogger(new ErrorLogger(null)));

        logger.log(LogLevel.INFO, "This is the first logger");
        logger.log(LogLevel.ERROR, "This is the second logger");
        logger.log(LogLevel.DEBUG, "This is the third logger");
    }
}

enum LogLevel {
    ERROR, INFO, DEBUG;
}

// handler
abstract class Logger {

    Logger nextLogger;

    public Logger(Logger logger) {
        this.nextLogger = logger;
    }

    public void log(LogLevel logLevel,String message) {
        if (nextLogger != null) {
            nextLogger.log(logLevel, message);
        }
    }
}

class ErrorLogger extends Logger{

    public ErrorLogger(Logger logger) {
        super(logger);
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel.equals(LogLevel.ERROR)) {
            System.out.println("Error log : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}

class InfoLogger extends Logger {

    public InfoLogger(Logger logger) {
        super(logger);
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel.equals(LogLevel.INFO)) {
            System.out.println("Info log : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}

class DebugLogger extends Logger {

    public DebugLogger(Logger logger) {
        super(logger);
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel.equals(LogLevel.DEBUG)) {
            System.out.println("Debug log : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}