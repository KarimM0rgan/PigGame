/** Die used in the game of Pig. */
public class Die {
    /** Number of faces on the die. */
    private int numSides;
    /** The upward facing face. */
    private int face;

    /** Creates a die with the given number of sides. */
    public Die(int numSides) {
        this.numSides = numSides;
        face = 1;
    }

    /** Rolls the die. */
    public void roll() {
        face = StdRandom.uniform(1, numSides + 1);
    }

    /** Returns the current upward face. */
    public int getFace() {
        return face;
    }
}