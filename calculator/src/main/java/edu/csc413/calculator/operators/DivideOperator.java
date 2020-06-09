public class DivideOperator extends Operator{

    public int priority(){
        return 2;
    }

    //DivideOperator execute(Operand operand1, Operand operand2)

    Operand execute(Operand operand1, Operand operand2)
    {
        int value = operand1/operand2;
        return value;
    }
}