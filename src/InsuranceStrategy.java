public class InsuranceStrategy {
    public incomeStrategyVeryHigh strategy;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income*0.365;
        } else if (income <= 30000) {
            return (income-10000)*0.2+35600;
        } else if (income <= 60000) {
            return (income-30000)*0.1+76500;
        } else {
            strategy = new incomeStrategyVeryHigh();
            return strategy.calculateInsuranceVeryHigh(income);
        }
    }

    public double calculateInsuranceVeryHigh(double income) {
        return (income-60000)*0.02+105600;
    }

    public int getConstant() {
        return 105600;
    }

    public double getWeight() {
        return 0.02;
    }

    public int getAdjustment() {
        return 60000;
    }
}