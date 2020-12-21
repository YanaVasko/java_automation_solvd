package com.solvd.games.sportgames;

public class Swimming extends SummerSportGames implements Sport{
    public Swimming(String winner) {
        super(winner);
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.getClass().getSimpleName());
    }

    @Override
    public void printInfo() {
        System.out.println("Swimming");
    }
}
