package behavioral.command.btvidu;

public class CalculatorCommand implements ICommand{
    private char operator;
    private float operand;
    private CommandHandler handler;

    public CalculatorCommand(char operator, float operand, CommandHandler handler) {
        this.operator = operator;
        this.operand = operand;
        this.handler = handler;
    }

    @Override
    public void excute() {
        handler.handle(operator,operand);
    }

    @Override
    public void unexcute() {
        char undoOperator = undoOperator();
        handler.handle(undoOperator,operand);
    }

    public char undoOperator() {
        switch (operator){
            case'+': return '-';
            case'-': return '+';
            case'*': return '/';
            case'/': return '*';
        }
        return '=';
    }
}
