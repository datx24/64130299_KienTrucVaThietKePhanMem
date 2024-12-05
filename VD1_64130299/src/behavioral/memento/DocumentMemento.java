package behavioral.memento;

//Lớp memento này lưu trữ trạng thái của Document
public class DocumentMemento {
    private final String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

