package behavioral.command;

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
        if(!undos.isEmpty()) {
            ICommand command = undos.pop();
            redos.push(command);
            System.out.println("Undo: ");
            command.unexcute();
        }
    }

    public void redo() {
        if(!redos.isEmpty()) {
            ICommand command = redos.pop();
            undos.push(command);
            System.out.println("Redo: ");
            command.excute();
        }
    }

    public void clear() {
        System.out.println("Clear: ");
        handler.result = 0;
        undos.clear();
        redos.clear();
    }

    public float getResult() {
        return handler.getResult();
    }
}
