package app;

public class Main {

    private static final double CONV_k = 2.20462;

    public static void main(String[] args) {

        System.out.println("Version 1.0.");

        double kgs = 5;
        double pnds = 12;
        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pnds);
        System.out.println("Result is " + pounds + " pounds and " + kilos + "kgs.");
    }

    private static double convKgsToPounds(double kgs){
        return kgs * CONV_k;
    }

    private static double convPoundsToKgs(double pnds){
        return pnds / CONV_k;
    }
}
