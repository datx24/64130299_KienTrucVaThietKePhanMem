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
        DocumentMemento memento = history.getBackward();
        if(memento != null) {
            doc.restoreDocFromMemento(memento);
        } else {
            System.out.println("Không có dữ liệu để undo.");
        }
    }

    public void redo() {
        DocumentMemento memento = history.getForward();
        if(memento != null) {
            doc.restoreDocFromMemento(memento);
        } else {
            System.out.println("Không có dữ liệu đẻ redo.");
        }
    }

    public String getDocumentContent() {
        return doc.getContent();
    }
}
