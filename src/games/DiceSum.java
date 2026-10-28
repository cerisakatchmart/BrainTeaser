package games;

import core.GenericGame;

/**
 * Simulates rolling two fair six-sided dice and records how often
 * each possible sum (2 through 12) appears.
 *
 * <p>Counts are stored in an array indexed by the sum itself, so the
 * count for a sum of 7 lives at index 7. Indices 0 and 1 are never
 * used, since no roll of two dice can produce those totals.
 *
 * <p>The exact probability of each sum s is the number of ways to roll
 * it divided by 36: one way for 2 or 12, rising by one per step to six
 * ways for 7. Comparing the simulated frequencies to these values shows
 * how the estimates converge as the number of rolls grows.
 */
public class DiceSum implements GenericGame {
    @Override
    public String getName() {
        return "Dice Sum";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double exactAnswer() {
        return 0;
    }

    @Override
    public double playOnce() {
        return 0;
    }
}
