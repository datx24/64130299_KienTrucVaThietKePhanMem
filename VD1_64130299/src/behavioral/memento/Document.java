package behavioral.memento;

//Lớp này lưu trữ nội dung của tài liệu và có thể tạo memento để lưu trạng thái hiện tại.
public class Document {
    private String content = "";

    public void write(String text) {
        content += text;
    }

    public DocumentMemento createDocMemento() {
        return new DocumentMemento(content);
    }

    public void restoreDocFromMemento(DocumentMemento memento) {
        this.content = memento.getContent();
    }

    public String getContent() {
        return content;
    }
}

