package org.example.calculator;

public class Calculator {

    public float operator(String operator, float numberA, float numberB) {
        float result = -1;
        if (operator.equals("+")) {
            result = numberA + numberB;
        }
        if (operator.equals("-")) {
            result = numberA - numberB;
        }
        if (operator.equals("*")) {
            result = numberA * numberB;
        }
        if (operator.equals("/")) {
            if(numberB == 0){
                throw new IllegalArgumentException("Cannot divded by zero");
            }
            result = numberA / numberB;
        }
        return result;
    }

}
