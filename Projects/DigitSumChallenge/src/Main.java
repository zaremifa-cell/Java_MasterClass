public class Main {

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1; // invalid value
        }

        int sum = 0;

        while (number >= 10) {
            sum += number % 10;
            number /= 10;
        }

        return sum + number;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(-10));  // -1
        System.out.println(sumDigits(125));  // 8
        System.out.println(sumDigits(1000)); // 1
        System.out.println(sumDigits(1234)); // 10
    }
}