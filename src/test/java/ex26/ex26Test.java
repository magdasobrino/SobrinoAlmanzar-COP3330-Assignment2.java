package ex26;

import org.junit.Test;

import static org.junit.Assert.*;

public class ex26Test {

    @Test
        void calculateMonthsUntilPaidOff_test() {
            PaymentCalculator calculate = new PaymentCalculator();

            double expected = 70.0;
            double actual = calculate.calculateMonthsUntilPaidOff(5000, 12, 100);

            assertEquals(expected, actual);
        }

        @Test
        void calculateMonthsUntilPaidOff_correct_output_2nd_test() {
            PaymentCalculator calculate = new PaymentCalculator();

            double expected = 394.0;
            double actual = calculate.calculateMonthsUntilPaidOff(4000, 15, 50);

            assertEquals(expected, actual);
        }
    }