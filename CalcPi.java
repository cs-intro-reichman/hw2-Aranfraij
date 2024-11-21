public class CalcPi {
    public static void main(String args[]) {
        // Default values
        int rounds = 10;     // Default number of rounds
        int numerator = 1;   // Default numerator

        // Parse arguments if provided
        if (args.length >= 1) {
            try {
                rounds = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignored) {
                // Use default rounds if the input is invalid
            }
        }

        if (args.length >= 2) {
            try {
                numerator = Integer.parseInt(args[1]);
            } catch (NumberFormatException ignored) {
                // Use default numerator if the input is invalid
            }
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
