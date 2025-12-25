public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Zlatko", 100);
        System.out.println("New score is: " + newScore);

        calculateScore(75);
        calculateScore();
    }

    static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points");
        return score * 1000;
    }

    static void calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
    }

    static void calculateScore() {
        System.out.println("No player name, no player score.");
    }
}