package hm_5.ap;

public class CalcCostDelivery extends CalcCostBase {

        private final static double deliveryPrice = 5.0;

        public double calcCost(Product product) {
            return product.getQuota() * product.getPrice() + deliveryPrice;
        }
    }

