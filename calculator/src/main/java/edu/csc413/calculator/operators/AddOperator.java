public class AddOperator extends Operator{
    //We need two items,
    //This also needs a priority, or we can assign priority in Operator.
   // AddOperator addOperator = new AddOperator();


public int priority(){
    return 1;
    }

  Operand execute(Operand operand1, Operand operand2){
    int value = operand1 + operand2;
    return value;

}
}