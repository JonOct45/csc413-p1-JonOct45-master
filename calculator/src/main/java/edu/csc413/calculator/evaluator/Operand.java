package edu.csc413.calculator.evaluator;
/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */

public class Operand {

    String token;

    public double value;
    // Setters and Getters.
    public Operand(String token) {
        //Parse the token from string to an int.
        this.value = Integer.parseInt(token);
        //int value = Integer.parseInt(token)
        //  return value;
    }

    public Operand(double value) {
        //Taking in value and returning the value for Operand.
        this.value = value;
        // return value;
    }

    //Getter for operand value
    public int getValue() {

        return value;
    }


    public static boolean check(String token) {
        try {
            Integer.parsInt(token);

        } catch (Exception ex)
        return false;
    }
    return true
}
}
