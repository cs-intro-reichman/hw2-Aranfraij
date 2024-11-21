// Prints a crowd cheering output.
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

        // Cheer for each character in the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if ("AEIOUaeiou".indexOf(c) != -1) {
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
