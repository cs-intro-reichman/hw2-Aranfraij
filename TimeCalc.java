// Performs time calculations. 
public class TimeCalc {
	public static void main(String[] args) {
		String time = args[0];
		String mins = args[1];
		System.out.println(TimeCalc(time,mins));
	}

	public static String TimeCalc(String time, String mins){
		if (time.length() != 5 || time.indexOf(':') == -1){
            return "Invalid input";
        }
        String digits = "0123456789";
        if (digits.indexOf(time.charAt(0)) == -1 || digits.indexOf(time.charAt(1)) == -1 
            || digits.indexOf(time.charAt(3)) == -1 || digits.indexOf(time.charAt(4)) == -1){
            return "Invalid input";
        }
        boolean flag = true;
        int sign = mins.charAt(0) == '-' ? -1 : 1;
        int startIndex = mins.charAt(0) == '-' ? 1 : 0;

        for (int i = startIndex; i < mins.length() && flag; i++) {
            flag = (digits.indexOf(mins.charAt(i)) != -1);
        } 
        if (!flag){
            return "Invalid input";
        }
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
		int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));
        if (hours > 23 || hours < 0 || minutes > 59 || minutes < 0){
            return "Invalid input";
        }
        int totalMinutesToCalc = Math.abs(Integer.parseInt(mins));
        int hoursToCalc = totalMinutesToCalc / 60;
        int minsToCalc = totalMinutesToCalc % 60;
        int minsResult = minutes + (sign * minsToCalc);
        int hoursToCarry = 0;
        if (minsResult < 0 || minsResult > 59){
            if (minsResult < 0){
                hoursToCarry--;
                minsResult += 60;
            } else {
                hoursToCarry++;
                minsResult -= 60;
            }
        }
        int hoursResult = hours + hoursToCarry + (sign * hoursToCalc);
        if (hoursResult >= 24 || hoursResult < 0 ){
            if (hoursResult >= 24){
                hoursResult = hoursResult % 24;
            } else {
                hoursResult += 24;
            }
        }
        String minutesFormatted = (minsResult >= 10) ? minsResult+"" : ("0" + minsResult);
        String amPm = (hoursResult >= 12) ? " PM" : " AM";
        int hoursFormatted = (hoursResult > 12) ? hoursResult - 12 : hoursResult;

        system.out.println("" + hoursFormatted + ":" + minutesFormatted + amPm);

	}
}
