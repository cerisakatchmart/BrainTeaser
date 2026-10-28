package games;

import core.GenericGame;

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
