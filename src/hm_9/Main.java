package hm_9;

public class Main {
    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        // Processing an array of product names
        String namesOutput = dataHandler.handleData(provider.getProductName());
        getOutput("Products: " + namesOutput);

        // Processing an array of sales amounts
        String salesOutput = dataHandler.handleData(provider.getSalesAmounts());
        getOutput("Sales, EUR: " + salesOutput);
    }

    // Outputting the program's result
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
