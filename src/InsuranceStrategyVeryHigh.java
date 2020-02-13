class InsuranceStrategyVeryHigh {
    InsuranceStrategyVeryHigh() {
    }

    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    private int getConstant() {
        return 105600;
    }

    private double getWeight() {
        return 0.02;
    }

    private int getAdjustment() {
        return 60000;
    }
}