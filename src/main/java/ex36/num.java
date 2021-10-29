package ex36;

public class num {

    public double calculateAverage(double[] stats) {
        double average;
        double sum = 0;

        for(int i = 0; i < stats.length ; ++i)
        {
            sum = sum + stats[i];
        }

        average = sum / stats.length;

        return average;
    }

    public double calculateMinimum(double[] stats) {
        double min = stats[0];

        for(int i = 0; i < stats.length; ++i)
        {
            if(min > stats[i])
                min = stats[i];
        }

        return min;
    }

    public double calculateMaximum(double[] stats) {
        double max = stats[0];

        for(int i = 0; i < stats.length; ++i)
        {
            if(max < stats[i])
                max = stats[i];
        }
        return max;
    }

    public double calculateStandardDev(double[] stats, double average) {

        double numerator = 0;
        for(int i = 0; i < stats.length; i++)
        {
            double differenceSquared = Math.pow((stats[i] - average), 2);
            numerator = numerator + differenceSquared;
        }

        double standardDev = Math.sqrt(numerator / (stats.length - 1));


        return standardDev;
    }
}