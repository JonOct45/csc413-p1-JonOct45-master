public class SubtractOperator extends Operator{
//Priority 1, execute method
    public int priority(){
        return 1;
    }

    SubtractOperator execute(Operand operand1, Operand operand2){
        int sub = operand1-operand2;
        return sub;

    }
}