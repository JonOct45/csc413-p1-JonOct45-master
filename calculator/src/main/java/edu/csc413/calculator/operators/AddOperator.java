public class AddOperator extends Operator{
    //We need two items,
    //This also needs a priority, or we can assign priority in Operator.
   // AddOperator addOperator = new AddOperator();
    // This is where we are changing the Operand object.

private int valueCalculated;

public int priority(){
    return 1;
    }

  public Operand execute(Operand operandOne, Operand operandTwo){
    int valueCalculated = operandOne.getValue() + operandTwo.getValue();

    value = new Operand(valueCalculated);

    return value;

}
}