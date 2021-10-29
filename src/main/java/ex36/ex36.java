  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex36;
  import java.text.DecimalFormat;
  import java.util.ArrayList;
  import java.util.Scanner;

  public class ex36 {
      private static final Scanner input = new Scanner(System.in);

      public static ArrayList<String> readUserInput()
      {
          String number = "";
          ArrayList<String> stats = new ArrayList<>();
          while(!(number.equals("done")))
          {
              System.out.print("Enter a number: ");
              number = input.nextLine();
              if(!(number.equals("done")))
                  stats.add(number);
          }

          return stats;
      }

      public static void main(String[] args) {


          ArrayList<String> stats;
          stats = readUserInput();
          double[] newStats = new double[stats.size()];

          ArrayList<Double> convertStats = new ArrayList<>();
          for (int i = 0; i < stats.size(); i++) {
              convertStats.add(Double.valueOf(stats.get(i)));
              newStats[i] = convertStats.get(i);
          }

          num calculate = new num();
          double average = calculate.calculateAverage(newStats);
          double min = calculate.calculateMinimum(newStats);
          double max = calculate.calculateMaximum(newStats);
          double standardDev = calculate.calculateStandardDev(newStats, average);

          DecimalFormat df = new DecimalFormat("###.###");
          System.out.print("The average is " + df.format(average) + ".\n" +
                  "The minimum is " + df.format(min) + ".\n" +
                  "The maximum is " + df.format(max) + ".\n" +
                  "The standard deviation is " + df.format(standardDev) + ".");
      }

  }