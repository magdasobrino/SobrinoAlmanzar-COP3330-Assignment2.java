package ex31;

public class Calculation {
    public static double target(int rest, int age, double intensity) {
        return (double) (((220 - age) - rest) * intensity) + rest;
    }

    public static void print(int rest, int age) {
        System.out.printf("Resting pulse: %d Age: %d%n%10s | %6s%n---------------------%n", rest, age, "Intensity", "BPM");
        for (int i = 55; i <= 95; i += 5) {
            System.out.printf("%5d%%     | %4.0f bpm%n", i, Calculation.target(rest, age, i / 100.0));
        }
    }
}

