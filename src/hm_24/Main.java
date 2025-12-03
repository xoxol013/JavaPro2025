package hm_24;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        //
        logger1.log("First log");
        logger2.log("Another log from a different place");

        System.out.println(logger1 == logger2);

        logger1.printLogs();
    }
}
