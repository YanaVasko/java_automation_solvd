package com.solvd.games.sportgames;

public class Basketball extends SummerSportGames implements Sport {

    private String name;

    public Basketball(String name) {
        this.name = name;
    }

    public Basketball() {
        super();
    }

    @Override
    public void play() {
        System.out.println(name + " is the most popular game in the USA. Everybody play there in such game");
    }

    @Override
    public void printInfo() {
        System.out.println("======" + this.getClass().getSimpleName() + " is Summer Olympic Game=====");
    }
}
