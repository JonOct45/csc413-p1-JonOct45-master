public class OpenParentheses extends Operator{

    public priority(){
        return 0;
    }

    Operand exectute(Operand operand1, Operand operand2){
        //We aren't going to be doing anything here. Using priority~
        //since it's open, we need to pop/execute until we see ClosedParentheses

    }
}