public class IfThenElseChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelsCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOver){
            finalScore += (levelsCompleted * bonus);
            System.out.println("Your final score was: "+ finalScore);
        }
    }
}
