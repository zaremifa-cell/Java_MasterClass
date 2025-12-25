public class Main {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 300);
        String result = displayHighScore("Player1", highScore);
        System.out.println(result);

        highScore = calculateScore(true, 10000, 8, 200);
        result = displayHighScore("Player2", highScore);
        System.out.println(result);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }

    public static String displayHighScore(String playerName, int highScore) {
        return playerName + " managed to get a highScore of " + highScore;
    }
}
