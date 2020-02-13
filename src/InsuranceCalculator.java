class InsuranceCalculator extends InsuranceStrategy {
    double calculateInsurance(double income) {
        InsuranceStrategy strategy;
        if (income <= 10000) {
            strategy = new InsuranceStrategyLow();
            return strategy.calculateInsuranceVeryHigh(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyMedium();
            return strategy.calculateInsuranceVeryHigh(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyHigh();
            return strategy.calculateInsuranceVeryHigh(income);
        } else {
            strategy = new incomeStrategyVeryHigh();
            return strategy.calculateInsuranceVeryHigh(income);
        }
    }
}