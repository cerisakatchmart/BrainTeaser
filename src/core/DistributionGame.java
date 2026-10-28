package core;

import java.util.Random;

/**
 * One round -> one outcome category
 * */
public interface DistributionGame {
    /**
     * Returns a short, human-readable name for this game.
     * */
    String getName();

    /**
     * Returns a one-sentence statement of the puzzle
     * */
    String getDescription();

    /**
     *
     * */
    int playOnce(Random rng);

    /**
    *
    * */
    double expectedOutcome(int outcome);

}
