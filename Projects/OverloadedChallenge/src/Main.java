public class Main {
    public static void main(String[] args) {
        double result = HeightConverter.convertToCentimeters(5, 8);
        System.out.println(result);
    }
}

class HeightConverter {

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = feet * 12 + inches;
        return convertToCentimeters(totalInches);
    }
}