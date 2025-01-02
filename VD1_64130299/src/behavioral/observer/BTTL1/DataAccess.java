package behavioral.observer.BTTL1;

public class DataAccess {
    private static DataAccess instance;
    private Stream<MonHoc> stream = new Stream<>();

    private DataAccess() {};

    public static DataAccess getInstance() {
        if (instance == null) {
            instance = new DataAccess();
        }
        return instance;
    }

    public Stream<MonHoc> getStream() {
        return stream;
    }

    public void themMonHoc(MonHoc mh) {
        stream.addEvent(mh);
    }
}
