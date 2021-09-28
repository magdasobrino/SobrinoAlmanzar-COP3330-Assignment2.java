package ex26;

public class PaymentCalculator {

    public static double calculateMonthsUntilPaidOff(double balance, double APR, double monthlyPayment){

        double APRCalculation = (APR * 0.01)/365;


        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)// equation//
     return -(1.0/30.0) * Math.log10(1.0 + balance/ monthlyPayment  * (1 - Math.pow((1.0 + APRCalculation), 30.0))) / Math.log10(1.0 + APRCalculation);

    }
    public static String print(int output) {
        return String.format("It will take you %d months to pay off this card.", output);

    }
} //end of program//
