package ex30;

public class MultiplicationTable {
    String generateTables()
    {
        String output = "";

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                int product = i * j;
                output = output + (i + " X " + j + " = " + product + "\n");
            }
        }
        return output;
    }

}
