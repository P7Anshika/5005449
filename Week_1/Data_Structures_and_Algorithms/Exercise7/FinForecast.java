package Exercise7;

public class FinForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        } else {
            return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
        }
    }

    public static void main(String[] args) {
        double initialValue = 1000;
        double growthRate = 0.05;
        int years = 10;
        
        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        
        System.out.println("Future Value: Rs" + futureValue);
    }

}
