public class ThirdClass {
    public static void main(String[] args) {
        System.out.println("Hello, Zlatko");

        boolean isAlien = false;
        if (!isAlien) System.out.println("It is not an alien");

        int topScore = 80, secondTopScore = 81;
        if (topScore == 100) System.out.println("You got the high score");
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");
        if (topScore > 90 || secondTopScore < 90)
            System.out.println("Either top score or second score is less than 90");

        String makeOfCar = "BMW";
        if ("BMW".equals(makeOfCar)) System.out.println("It is a BMW");
    }
}
