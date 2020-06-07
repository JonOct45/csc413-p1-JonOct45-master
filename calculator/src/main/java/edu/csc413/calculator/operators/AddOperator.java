public class AddOperator extends Operator{
    //We need two items,
    //This also needs a priority, or we can assign priority in Operator.
   // AddOperator addOperator = new AddOperator();


public int priority(){
    return 1;
    }

public execute(Operand operand1, Operand operand2){
    int sum = operand1 + operand2;
    return sum;

}
}