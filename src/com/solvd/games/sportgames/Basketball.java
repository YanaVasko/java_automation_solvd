package com.solvd.games.sportgames;

public class Basketball extends SummerSportGames implements Sport {

    public Basketball() {
        super();
    }

    public Basketball(String winner) {
        super(winner);
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.getClass().getSimpleName());
    }

    @Override
    public void printInfo() {
        System.out.println("Basketball");
    }
}
