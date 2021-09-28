package ex33;

public class NumberGenerator {

    public static String response(int rand) {
        switch (rand) {
            case 0:
                return "Yep.";
            case 1:
                return "Nah.";
            case 2:
                return "Maybe?";
            case 3:
                return "Ask again later.";
            default:
                return "Unable to generate response. Please try again.";
        }
    }
}


