public class Challenge {
    static void main(String[] args) {

        double firstValue = 20.00;
        System.out.println("firstValue = " + firstValue);

        double secondValue = 80.00;
        System.out.println("secondValue = " + secondValue);

        double total = (firstValue + secondValue) * 100.00;
        System.out.println("total = " + total);

        double remainder = total % 40.00;
        System.out.println("remainder = " + remainder);

        boolean isNoRemainder = (remainder == 0.00) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}