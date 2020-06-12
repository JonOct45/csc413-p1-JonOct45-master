public class DivideOperator extends Operator{

    private int valueCalculated;

    public int priority(){
        return 2;
    }

    //DivideOperator execute(Operand operand1, Operand operand2)

  abstract public Operand execute(Operand operandOne, Operand operandTwo)
    {
        int valueCalculated = operandOne.getValue()/operandTwo.getValue();

      Operand value = new Operand(valueCalculated);

        return value;
    }
}