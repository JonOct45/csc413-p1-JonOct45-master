public class MultiplyOperator extends Operator{
//priority 2, execute method
    public int priority(){
        return 2;
    }

    MultiplyOperator execute(Operand operand1, Operand operand2){
        int products = operand1*operand2;
        return products;
    }

}