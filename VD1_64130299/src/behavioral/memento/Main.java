package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        WordApp app = new WordApp();

        app.createDocument();
        app.appendDocument("Xin chào, ");
        app.appendDocument("các bạn!");
        System.out.println("Wordapp sau khi ghi: " + app.getDocumentContent());

        app.undo();
        System.out.println("Wordapp sau khi undo: " + app.getDocumentContent());

        app.redo();
        System.out.println("Wordapp sau khi redo: " + app.getDocumentContent());
    }
}


