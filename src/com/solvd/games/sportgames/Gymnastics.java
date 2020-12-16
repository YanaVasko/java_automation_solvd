package com.solvd.games.sportgames;

public abstract class Gymnastics extends SummerSportGames {

    private String gymnasticType;

    public abstract int getScore();

    public abstract void setScore(int score);

    public String getType() {
        return gymnasticType;
    }

    public void setGymnacticsType(String gymnasticType) {
        this.gymnasticType = gymnasticType;
    }
}