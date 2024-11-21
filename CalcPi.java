public class CalcPi {
    public static void main(String args[]) {
        // Ensure the correct number of arguments are provided
        if (args.length < 2) {
            return; // Exit the program if arguments are insufficient
        }

        // Parse arguments
        int rounds;
        int numerator;
        try {
            rounds = Integer.parseInt(args[0]);
            numerator = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            return;
        }

        // Calculate Pi approximation
        double sum = 0;
        int sign = 1;
        for (int i = 0; i < rounds; i++) {
            sum += sign * numerator / (2 * i + 1.0); // Include the alternating sign
            sign = sign * (-1); // Alternate the sign
        }

        // Print results
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + 4.0 * sum);
    }
}
