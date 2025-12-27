public class Main {

    public static void main(String[] args) {
        for (int day = 0; day <= 7; day++) {
            printDayOfWeek(day);
        }

        System.out.println(); // blank line between the two outputs

        for (int day = 0; day <= 7; day++) {
            printWeekDay(day);
        }
    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("day = " + day + ", dayOfTheWeek = " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {
        String dayOfTheWeek;

        if (day == 0) {
            dayOfTheWeek = "Sunday";
        } else if (day == 1) {
            dayOfTheWeek = "Monday";
        } else if (day == 2) {
            dayOfTheWeek = "Tuesday";
        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";
        } else if (day == 4) {
            dayOfTheWeek = "Thursday";
        } else if (day == 5) {
            dayOfTheWeek = "Friday";
        } else if (day == 6) {
            dayOfTheWeek = "Saturday";
        } else {
            dayOfTheWeek = "Invalid Day";
        }

        System.out.println("day = " + day + ", dayOfTheWeek = " + dayOfTheWeek);
    }
}