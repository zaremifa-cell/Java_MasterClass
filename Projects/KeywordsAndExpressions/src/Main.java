public class Main {
    static void main() {

        double kilometer = 100 * 1.609344;
        System.out.println("kilometer = " + kilometer);

        int highScore = 50;
        System.out.println("initial highScore = " + highScore);

        // използваме условие, което може да се промени, за да не е винаги true
        if (highScore > 40) {
            highScore += 1000; // add bonus points
            System.out.println("highScore after bonus = " + highScore);
        }

        int health = 45; // промяна, за да може условието да е понякога true
        System.out.println("health = " + health);

        if ((health < 50) && (highScore > 1000)) {
            highScore -= 1000;
            System.out.println("highScore after penalty = " + highScore);
        }

        System.out.println("final highScore = " + highScore);
    }
}