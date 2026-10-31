package persistent;

public class Persistent {
    private static Persistent instance;
    private Persistent() {
    }
    public static Persistent getInstance() {
        if (instance == null) {
            instance = new Persistent();
        }
        return instance;
    }
}
