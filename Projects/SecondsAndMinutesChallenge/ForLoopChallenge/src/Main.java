public class Main {

    public static void main(String[] args) {

        int primeCount = 0;

        for (int i = 2; i <= 1000; i++) {   // max <= 1000
            if (isPrime(i)) {
                System.out.println("Prime number: " + i);
                primeCount++;

                if (primeCount == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 1) {
            return false;
        }
        if (wholeNumber == 2) {
            return true;
        }
        if (wholeNumber % 2 == 0) {
            return false;
        }

        for (int divisor = 3; divisor <= Math.sqrt(wholeNumber); divisor += 2) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}