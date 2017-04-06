package zhangyi.insight.refactor.extractmethod;

import java.util.List;

public class Receipt {
    private List<Double> discounts;
    private List<Double> itemTotals;

    public double calculateGrandTotal() {
        double grandTotal = subTotal() - discount();
        return grandTotal + tax(grandTotal);
    }

    private double tax(double subTotal) {
        return subTotal * 0.065;
    }

    private double discount() {
        double disc = 0;
        if (discounts.size() > 0) {
            for (double discount : discounts)
                disc += discount;

        }
        return disc;
    }

    private double subTotal() {
        double subTotal= 0;
        for (double itemTotal : itemTotals) {
            subTotal += itemTotal;
        }
        return subTotal;
    }
}
