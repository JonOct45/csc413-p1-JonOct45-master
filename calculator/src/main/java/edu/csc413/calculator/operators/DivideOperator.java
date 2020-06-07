public class DivideOperator extends Operator{

    public int priority(){
        return 2;
    }

    DivideOperator execute(Operand operand1, Operand operand2){
        int divide = operand1/operand2;
        return divide;
    }
}