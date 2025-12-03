package hm_24;

public class Logger {

    private static Logger instance;

    private StringBuilder logs = new StringBuilder();

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logs.append(message).append("\n");
    }

    //
    public void printLogs() {
        System.out.println("--- LOGS ---");
        System.out.println(logs.toString());
    }
}

