public class Main {

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        int start = 5;
        int end = 20;

        int evenCount = 0;
        int oddCount = 0;

        while (start <= end) {

            if (isEvenNumber(start)) {
                System.out.println("Even: " + start);
                evenCount++;

                if (evenCount == 5) {
                    break;
                }
            } else {
                oddCount++;
            }

            start++;
        }

        System.out.println("Total even numbers found: " + evenCount);
        System.out.println("Total odd numbers found: " + oddCount);
    }
}