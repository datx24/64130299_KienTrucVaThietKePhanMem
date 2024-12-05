package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        WordApp app = new WordApp();

        app.createDocument();
        app.appendDocument("Hello, ");
        app.appendDocument("world!");
        System.out.println("Content after writing: " + app.getDocumentContent());

        app.undo();
        System.out.println("Content after undo: " + app.getDocumentContent());

        app.redo();
        System.out.println("Content after redo: " + app.getDocumentContent());
    }
}


