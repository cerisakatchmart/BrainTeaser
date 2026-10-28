package core;

public interface GenericGame {
    /**
     * Returns a short, human-readable name for this game.
     * */
     String getName();

    /**
     * Returns a one-sentence statement of the puzzle
     * */
     String getDescription();

    /**
     * Plays one independent round of the game and returns its outcome.
     * @return the expected value or probability
     * */
     double exactAnswer();

    /**
     * Plays one independent round of the game and returns its outcome.
     * @return the outcome of this round
     * */
     double playOnce();

}
