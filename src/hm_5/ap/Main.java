package hm_5.ap;

public class Main {
    public static void main(String[] args) {

        // Get input data
        String[] data = getData();

        // We create an object from the input data
        Product product = new Product(data[0], Integer.parseInt(data[1]),
                Double.parseDouble(data[2]));

        // Calculate base price psc
        CalcCostBase costBase = new CalcCostBase();
        double baseCost = costBase.calcCost(product);

        // Calculate price pcs, whith a delivery
        CalcCostDelivery costDelivery = new CalcCostDelivery();
        double deliveryCost = costDelivery.calcCost(product);

        // Create output
        String baseOutput = product + "\nCost is " + Constants.CURRENCY + " " + baseCost + ".";
        String deliveryOutput = product + "\nCost is " + Constants.CURRENCY + " " + deliveryCost + ".";

        // Output result
        getOutput(baseOutput);
        getOutput(deliveryOutput);
    }

        public static String[] getData() {
            return new String[] {"abs", "5", "2.5"};
        }

        public static void getOutput(String output) {
            System.out.println(output);
        }
    }

