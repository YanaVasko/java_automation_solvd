package com.solvd.games.sportgames;

public class ArtisticGymnastic extends Gymnastics {
    private int score;

    public ArtisticGymnastic() {
        this.score = 0;
    }

    @Override
    public int getScore() {
        return this.score;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    public void printFields() {
        System.out.println("Score of the game: " + this.score);
    }
}
