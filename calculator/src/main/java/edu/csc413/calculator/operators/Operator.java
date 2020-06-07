package edu.csc413.calculator.operators;
import java.util.Hashmap;

import edu.csc413.calculator.evaluator.Operand;

public abstract class Operator {


    //What keys and tokens do we need? Thinking of private.
    //VALUEs will be the instances of Operators, so we need
    //to get from another file. So we have the +-()*^ for it,
    //What will we do if there are ()?
    static HashMap<String, String> objectWeNeed;

    // The Operator class should contain an instance of a HashMap
    // This map will use keys as the tokens we're interested in,
    // and values will be instances of the Operators.
    // ALL subclasses of operator MUST be in their own file.
    // Example:
    // Where does this declaration go? What should its access level be?
    // Class or instance variable? Is this the right declaration?
    // HashMap operators = new HashMap();
    // operators.put( "+", new AdditionOperator() );
    // operators.put( "-", new SubtractionOperator() );

    /**
     * retrieve the priority of an Operator
     * @return priority of an Operator as an int
     */
    public abstract int priority();

    /**
     * Abstract method to execute an operator given two operands.
     * @param operandOne first operand of operator
     * @param operandTwo second operand of operator
     * @return an operand of the result of the operation.
     */
    public abstract Operand execute(Operand operandOne, Operand operandTwo);

    /**
     * determines if a given token is a valid operator.
     * please do your best to avoid static checks
     * for example token.equals("+") and so on.
     * Think about what happens if we add more operators.
     */
    public static Operator getOperator(String token) {
        return null;
    }

    /**
     * used to retrieve an operator from our HashMap.
     * This will act as out publicly facing function,
     * granting access to the Operator HashMap.
     *
     * @param token key of the operator we want to retrieve
     * @return reference to a Operator instance.
     */
    public static boolean check(String token) {
        try{
            Integer.parseInt(token);
        }catch(Exception ex) {
            return false;
        }
        return true;
    }

}