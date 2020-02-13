import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {
    @Test
    void low() {
        assertEquals(1825, insuranceFor(5000), 0.01);
    }

    @Test
    void medium() {
        assertEquals(38600, insuranceFor(25000), 0.01);
    }

    @Test
    void high() {
        assertEquals(78500, insuranceFor(50000), 0.01);
    }

    @Test
    void veryHigh() {
        assertEquals(106400, insuranceFor(100_000), 0.01);
    }

    private double insuranceFor(double income) {
        return new InsuranceCalculator().calculateInsurance(income);
    }

}