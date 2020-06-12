public class PowerOperator extends Operator{
//priority 3, execute method

    public int priority(){
        return 3;
    }
    private int valueCalculated;
    private int base;
    private int exp;

   public abstract Operand execute(Operand operand1, Operand operand2){
        int base = operand1.getValue;
        int exp = operand2.getValue;

        double valueCalculated = Math.pow(base, exponent);
        value = new Operand(valueCalculated);
        return value;
    }

}