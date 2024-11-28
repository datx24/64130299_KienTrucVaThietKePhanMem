package behavioral.command;

import java.util.Stack;

public class CasioCalculator {
    private Stack<ICommand> undos = new Stack<>();
    private Stack<ICommand> redos = new Stack<>();
    private CommandHandler handler = new CommandHandler();

    public void compute(char operator,char operand) {
        ICommand command = new CalculatorCommand(operator,operand,handler);
        command.excute();
        undos.push(command);
    }

    public void undo() {
        if(!undos.isEmpty()) {
            ICommand command = undos.pop();
            command.unexcute();
            redos.push(command);
        }
    }

    public void redo() {
        if(!redos.isEmpty()) {
            ICommand command = redos.pop();
            command.excute();
            undos.push(command);
        }
    }

    public void clear() {
        undos.clear();
        redos.clear();
        handler.setResult(0);
    }

    public float getResult() {
        return handler.getResult();
    }
}
