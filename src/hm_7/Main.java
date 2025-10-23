package hm_7;

public class Main {

    public static void main(String[] args) {

        Corrector corrector = new Corrector();
        String output = corrector.handleData(new DataProvider().getData());
        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
