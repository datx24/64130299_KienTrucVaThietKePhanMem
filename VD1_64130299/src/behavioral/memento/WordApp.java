package behavioral.memento;

//Lớp này là lớp chính để thực hiện các hành động trên tài liệu và gọi các phương thức của History để thực hiện undo và redo.
public class WordApp {
    private Document doc;
    private History history;

    public WordApp() {
        this.doc = doc;
        this.history = history;
    }

    public void createDocument() {
        doc = new Document();
        history = new History();
    }

    public void appendDocument(String text) {
        history.addMemento(doc.createDocMemento());
        doc.write(text);
    }

    public void undo() {
        DocumentMemento memento = history.getBackward(); // Lấy trạng thái trước đó
        if (memento != null) {
            doc.restoreDocFromMemento(memento); // Khôi phục tài liệu
        }
    }

    public void redo() {
        DocumentMemento memento = history.getForward(); // Lấy trạng thái redo
        if (memento != null) {
            doc.restoreDocFromMemento(memento); // Khôi phục tài liệu
        }
    }

    public String getDocumentContent() {
        return doc.getContent();
    }
}
