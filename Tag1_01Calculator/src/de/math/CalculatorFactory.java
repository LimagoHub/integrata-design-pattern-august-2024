package de.math;

import common.LoggerProxy;

public class CalculatorFactory {

    private static boolean logger = false;
    private static boolean secure = false;

    public static boolean isLogger() {
        return logger;
    }

    public static void setLogger(boolean logger) {
        CalculatorFactory.logger = logger;
    }

    public static boolean isSecure() {
        return secure;
    }

    public static void setSecure(boolean secure) {
        CalculatorFactory.secure = secure;
    }

    public static Calculator createCalculator() {
        Calculator calculator = new CalculatorImpl();
        //if(logger) calculator = new CalculatorLogger(calculator);
        if(logger) calculator = (Calculator) LoggerProxy.newInstance(calculator);
        if (secure) calculator = new CalculatorSecure(calculator);
        return calculator;
    }
}
