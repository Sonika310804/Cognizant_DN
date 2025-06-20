package Algorithms_DataStructure.Financial_Forecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return calculateFutureValue(principal, rate, years - 1) * (1 + rate);
    }

    // Optimized version using Memoization (optional)
    public static double calculateFutureValueMemo(double principal, double rate, int years, double[] memo) {
        if (years == 0) return principal;
        if (memo[years] != 0) return memo[years];

        memo[years] = calculateFutureValueMemo(principal, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        double principal = 10000; // initial amount
        double rate = 0.05;       // 5% growth rate
        int years = 10;

        double value = calculateFutureValue(principal, rate, years);
        System.out.printf("Recursive Future Value after %d years: ₹%.2f%n", years, value);

        // With memoization
        double[] memo = new double[years + 1];
        double optimizedValue = calculateFutureValueMemo(principal, rate, years, memo);
        System.out.printf("Memoized Future Value after %d years: ₹%.2f%n", years, optimizedValue);
    }
}
