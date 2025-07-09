/**
 * A Player for a game of Pig.
 * <p>
 * A Player starts with a score that is initially 0. {@link Player#takeTurn}
 * will take a single turn, reading input from standard input.
 */
public class Player {
    /** Current score, initially zero. */
    private int score;
    /** Player's name. */
    private String name;
    /** The die the player will roll. */
    private Die die;

    /** Create a player with the given name and die to roll. */
    public Player(String name, Die die) {
        this.name = name;
        this.die = die;
    }

    /** Reads a single character from standard input. */
    private char readOne() {
        String line = StdIn.readLine();
        if (line.isEmpty()) {
            return 0;
        }
        return line.charAt(0);
    }

    /** Takes a single turn for the player, reading from standard input. */
    public void takeTurn() {
        int turnScore = 0;
        StdOut.println("You have accumulated " + turnScore + " points.");
        StdOut.print("Type s to stop, anything else to roll: ");
        char input = readOne();
        while (input != 's') {
            die.roll();
            int roll = die.getFace();
            StdOut.println("You have rolled a " + roll);
            if (roll == 1) {
                StdOut.println("You do not score any points.");
                turnScore = 0;
                break;
            }
            turnScore += roll;
            StdOut.println("You have accumulated " + turnScore + " points.");
            StdOut.print("Type s to stop, anything else to roll: ");
            input = readOne();
        }
        StdOut.println();
        score += turnScore;
    }

    /** Returns the player's info, as a string. */
    public String toString() {
        return name + ": " + score;
    }

    /** Returns the player's name. */
    public String getName() {
        return name;
    }

    /** Returns the player's score. */
    public int getScore() {
        return score;
    }
}
