/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
package ex26;

import java.util.Scanner;

public class ex26 {

 public static void main(String[] args) {
  Scanner scnr = new Scanner(System.in);

  double balance, APR, months;
  double monthlyPayment;

  System.out.print("What is your balance? "); // ask user for balance //
  balance = scnr.nextDouble();

  System.out.print("What is the APR on the card (as a percent)? "); // ask user for APR//
  APR = scnr.nextDouble();

  System.out.print("What is the monthly payment you can make? ");
  monthlyPayment = scnr.nextDouble();

  int output = (int) Math.ceil(PaymentCalculator.calculateMonthsUntilPaidOff(balance,APR, monthlyPayment));
  String result = PaymentCalculator.print(output);
  System.out.println(result);



 } //end of main//

 } //end of program//

