package behavioral.command.AppCalculator;


public class CalculatorCommand implements ICommand {
    private char operator;
    private float operand;
    private CommandHandler commandHandler;

    public CalculatorCommand(char operator, float operand, CommandHandler commandHandler) {
        this.operator = operator;
        this.operand = operand;
        this.commandHandler = commandHandler;
    }

    @Override
    public void excute() {
        commandHandler.handle(operator,operand);
    }

    @Override
    public void unexcute() {
        char undoOperator = undoOperator();
        commandHandler.handle(undoOperator,operand);
    }

    private char undoOperator() {
        switch (operator) {
            case '+': return '-';
            case '-': return '+';
            case '*': return '*';
            case '/': return '/';
        }
        return '=';
    }
}
