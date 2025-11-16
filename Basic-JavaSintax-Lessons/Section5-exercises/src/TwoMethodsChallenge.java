public class TwoMethodsChallenge {
    public static void main(String[] args) {
        String player1Name = "Joseph";
        int player1Score = 1500;
        int player1Position = calculateHighScorePosition(player1Score);

        String player2Name = "Andreas";
        int player2Score = 1000;
        int player2Position = calculateHighScorePosition(player2Score);

        String player3Name = "Pandini";
        int player3Score = 500;
        int player3Position = calculateHighScorePosition(player3Score);

        String player4Name = "balistieri";
        int player4Score = 100;
        int player4Position = calculateHighScorePosition(player4Score);

        String player5Name = "Almnair";
        int player5Score = 25;
        int player5Position = calculateHighScorePosition(player5Score);

        displayHighScorePositions(player1Name, player1Position);
        displayHighScorePositions(player2Name, player2Position);
        displayHighScorePositions(player3Name, player3Position);
        displayHighScorePositions(player4Name, player4Position);
        displayHighScorePositions(player5Name, player5Position);
    }

    public static void displayHighScorePositions (String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position "+ playerPosition + " on the high score list!");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
