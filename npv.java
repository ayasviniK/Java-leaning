public class npv {

    public static void main(String[] args) {
        double initialInvestment = 350000;
        double rateOfReturn = 0.12;
        double[] cashFlows = {85000, 85000, 85000, 90000, 90000}; 
        double npv = 0;

        System.out.println("Year\tCash Inflow\tDiscount Factor\tPresent Value");
        System.out.println("--------------------------------------------------------");

        for (int t = 0; t < cashFlows.length; t++) {
            double discountFactor = Math.pow(1 + rateOfReturn, t + 1); 
            double presentValue = cashFlows[t] / discountFactor; 
            npv += presentValue; 

            System.out.printf("%d\t%.2f\t\t%.4f\t\t%.2f%n", t + 1, cashFlows[t], 1 / discountFactor, presentValue);
        }

        npv -= initialInvestment;

        System.out.println("--------------------------------------------------------");
        System.out.printf("Initial Investment: %.2f%n", initialInvestment);
        System.out.printf("Net Present Value (NPV): %.2f%n", npv);
    }

}
