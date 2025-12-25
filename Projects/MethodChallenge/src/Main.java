public class Main {
    public static void main(String[] args) {
        // Test with the specified scores: 1500, 1000, 500, 100, and 25
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(1000));
        displayHighScorePosition("Percy", calculateHighScorePosition(500));
        displayHighScorePosition("Gilbert", calculateHighScorePosition(100));
        displayHighScorePosition("James", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}

