public class Pig {
    public static void main(String[] args) {
        Pig pig = new Pig(2, 100);
        pig.play();
    }

    /** The die to be shared by players. */
    private Die die;
    /** The game's players. */
    private Player[] players;
    /** The cutoff score for winning the game. */
    private int maxScore;

    /** Create a Pig game with the given number of players and cutoff score. */
    public Pig(int numPlayers, int maxScore) {
        // TODO: Implement me.
        this.maxScore = maxScore;
        this.die = new Die(6);
        this.players = new Player[numPlayers];

        for (int i = 0; i<numPlayers; i++) {
            players [i] = new Player("Player " + (i+1), die);
        }
    }

    /** Returns the index of the winning player, or -1 if none exists. */
    private int winner() {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getScore() > maxScore) {
                return i;
            }
        }
        return -1;
    }

    /** Returns true iff the game is over. */
    private boolean gameOver() {
        // TODO: Implement me. Hint: you can use winner() to implement this very easily.
        return winner() != -1;
    }

    /** Prints the scores of all players. */
    private void printScores() {
        String output = "";
        // TODO: Implement me. Hint: use the toString() method in the Player class.
        for (int i = 0; i < players.length; i++) {
            output += players[i].toString() + "\n";
        }
        StdOut.println(output);
    }

    /** Play a game of Pig. */
    public void play() {
        StdOut.println("Pig\n");
        StdOut.println(
                "In this game you roll a die to accumulate and then score points.\n" +
                        "\n" +
                        "On your turn, you can keep rolling as long as you want, accumulating more points.\n" +
                        "You can stop at any time, scoring the points you've accumulated this turn.\n" +
                        "If you ever roll a 1, you lose all of the points you've accumulated this turn\n" +
                        "(but not those you've previously scored).\n" +
                        "\n" +
                        "The first payer to score 100 or more points wins.\n\n\n");

        // TODO: Implement me.
        while (!gameOver()) {
            for (int i = 0; i< players.length; i++) {
                StdOut.println("---------------");
                StdOut.println(players[i].getName() + "'s turn");
                StdOut.println("---------------");
                printScores();

                players[i].takeTurn();

                if (gameOver()) {
                    break;
                }
            }
        }
        StdOut.println("Game Over! The winner is " + players[winner()].getName());
    }
}
