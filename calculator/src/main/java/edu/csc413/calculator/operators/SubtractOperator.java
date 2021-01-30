public class SubtractOperator extends Operator{
//Priority 1, execute method, abstract


    private int valueCalculated;

    public int priority(){
        return 1;
    }

    //SubtractOperator execute(Operand operand1, Operand operand2)
   public Operand execute(Operand operandOne, Operand operandTwo)
    {
        int valueCaculated = operandOne.getValue()-operandTwo.getValue();
        value = new Operand(valueCalculated);
        return value;

    }
}