public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));    // 01h 05m 45s
        System.out.println(getDurationString(65));      // 00h 01m 05s
        System.out.println(getDurationString(-10));     // Invalid value
        System.out.println(getDurationString(60, 30));  // 01h 00m 30s
        System.out.println(getDurationString(60, 70));  // Invalid value
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value: seconds must be >= 0.");
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            System.out.println("Invalid value: minutes must be >= 0.");
            return "Invalid value";
        }

        if (seconds < 0 || seconds > 59) {
            System.out.println("Invalid value: seconds must be between 0 and 59.");
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return String.format("%02dh %02dm %02ds", hours, remainingMinutes, seconds);
    }
}