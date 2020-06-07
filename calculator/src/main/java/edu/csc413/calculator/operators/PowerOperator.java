public class PowerOperator extends Operator{
//priority 3, execute method
    public int priority(){
        return 3;
    }

    PowerOperator(Operand operand1, Operand operand2){
        int pwrd = operand1^operand2;
        return pwrd;
    }

}