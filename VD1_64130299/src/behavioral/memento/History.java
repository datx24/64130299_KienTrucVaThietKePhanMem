package behavioral.memento;

import java.util.Stack;

// Lớp này quản lý các memento để hỗ trợ undo và redo.
public class History {
    private Stack<DocumentMemento> undos = new Stack<>();
    private Stack<DocumentMemento> redos = new Stack<>();

    public void addMemento(DocumentMemento memento) {
        undos.push(memento);
        redos.clear();
    }

    public DocumentMemento getBackward() {
        if(!undos.isEmpty()){
            var memento = undos.pop();
            redos.push(memento);
            return memento;
        }
            return null;
    }

    public DocumentMemento getForward() {
        if(!redos.isEmpty()) {
            var memento = redos.pop();
            undos.push(memento);
            return memento;
        }
        return null;
    }
}
