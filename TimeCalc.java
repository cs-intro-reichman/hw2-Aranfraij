// Performs time calculations.
public class TimeCalc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide both the time and the number of minutes.");
            return;
        }
        
        String time = args[0];
        String mins = args[1];
        System.out.println(calculateTime(time, mins));
    }

    public static String calculateTime(String time, String mins) {
        // Validate time format (HH:MM)
        if (!time.matches("\\d{2}:\\d{2}")) {
            return "Invalid input";
        }

        // Validate and parse time
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            return "Invalid input";
        }

        // Validate and parse minutes
        int offsetMinutes;
        try {
            offsetMinutes = Integer.parseInt(mins);
        } catch (NumberFormatException e) {
            return "Invalid input";
        }

        // Total time in minutes
        int totalMinutes = hours * 60 + minutes + offsetMinutes;

        // Adjust for 24-hour wrapping
        totalMinutes = (totalMinutes % (24 * 60) + (24 * 60)) % (24 * 60);

        // Calculate final hours and minutes
        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        // Format time with leading zeros
        String formattedTime = String.format("%02d:%02d", finalHours, finalMinutes);

        return formattedTime;
    }
}
