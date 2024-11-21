import java.util.Set;

public class Cheers {
    public static void main(String[] args) {
        // Validate input arguments
        if (args.length < 2) {
            System.out.println("Error: Please provide the text and the number of times to cheer.");
            return;
        }

        String text = args[0].toUpperCase();
        int times;

        try {
            times = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: The second argument must be a valid integer.");
            return;
        }

        // Set of letters that require "an"
        Set<Character> anLetters = Set.of('A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X');

        // Cheer for each character in the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (anLetters.contains(c)) {
                System.out.println("Give me an " + c + ": " + c + "!");
            } else {
                System.out.println("Give me a " + c + ": " + c + "!");
            }
        }

        // Output the final cheer
        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++) {
            System.out.println(text + "!!!");
        }
    }
}
