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
        if (!undos.isEmpty()) {
            redos.push(undos.peek()); // Lưu trạng thái hiện tại vào redo
            return undos.pop();      // Lấy trạng thái trước đó
        }
        return null;
    }

    public DocumentMemento getForward() {
        if (!redos.isEmpty()) {
            var memento = redos.pop(); // Lấy trạng thái redo
            undos.push(memento);// Lưu trạng thái hiện tại vào undo
            return memento;
        }
        return null;
    }
}
