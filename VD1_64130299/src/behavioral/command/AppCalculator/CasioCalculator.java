package behavioral.command.AppCalculator;

import java.util.Stack;

public class CasioCalculator {
    private Stack<ICommand> undos = new Stack<>();
    private Stack<ICommand> redos = new Stack<>();
    private CommandHandler handler = new CommandHandler();

    public void compute(char operator,float operand) {
        ICommand command = new CalculatorCommand(operator,operand,handler);
        command.excute();
        undos.push(command);
    }

    public void undo() {
        ICommand command = undos.pop();
        redos.push(command);
        System.out.println("Undos: ");
        command.unexcute();
    }
    public void redo() {
        ICommand command = redos.pop();
        undos.push(command);
        System.out.println("Redos: ");
        command.excute();
    }
    public void clear() {
        System.out.println("Clear");
        handler.result = 0;
        undos.clear();
        redos.clear();
    }

    public float getResult() {
        return handler.getResult();
    }
}
