import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 5) {
            System.out.println("Enter number #" + count + ":");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
                scanner.next();
            }
        }

        System.out.println("The sum of the numbers is " + sum);
        scanner.close();
    }
}