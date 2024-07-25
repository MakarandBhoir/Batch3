
public class Test {

	// Write a java program to accept number of seconds as integer and display total number of minutes, hours and days out of it.
	// For example, if the number of seconds is 166, the output should be 2 minutes, 46 seconds.
	// If the number of seconds is 2000, the output should be 33 minutes, 20 seconds.
	// If the number of seconds is 86400, the output should be 1 day, 0 hours, 0 minutes, 0 seconds.
	
	public static void convertSecondsToDaysHoursMinutesSeconds(int seconds) {
		int minutes = seconds / 60;
		int hours = minutes / 60;
		int days = hours / 24;
		System.out.println(
				days + " days, " + hours % 24 + " hours, " + minutes % 60 + " minutes, " + seconds % 60 + " seconds.");
	}
	
	public static void main(String[] args) {
		convertSecondsToDaysHoursMinutesSeconds(166);
		convertSecondsToDaysHoursMinutesSeconds(2000);
		convertSecondsToDaysHoursMinutesSeconds(86400);

	}

}
