package com.solvd.games.sportgames;

public abstract class Gymnastics extends SummerSportGames {

    private String gymnasticType;

    public abstract int getScore();

    public abstract void setScore(int score);

    public final String getType() {
        return gymnasticType;
    }

    public final void setGymnacticsType(String gymnasticType) {
        this.gymnasticType = gymnasticType;
    }
}