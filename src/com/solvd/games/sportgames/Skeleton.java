package com.solvd.games.sportgames;

public class Skeleton extends WinterSportGames implements Sport, Winner {
    public Skeleton() {
        super();
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.getClass().getSimpleName());
    }

    @Override
    public void printInfo() {
        System.out.println("Skeleton");
        System.out.println(this.getWinner());
    }

    @Override
    public boolean getPrize() {
        return true;
    }
}
