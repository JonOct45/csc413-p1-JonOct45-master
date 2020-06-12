public class MultiplyOperator extends Operator{
//priority 2, execute method
    public int priority(){
        return 2;
    }

    private int value;
    public abstract Operand execute(Operand operandOne, Operand operandTwo){
        int value = operandOne.getValue*operandTwo.getValue;
        return products;
    }

}