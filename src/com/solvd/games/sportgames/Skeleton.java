package com.solvd.games.sportgames;

public class Skeleton extends WinterSportGames implements Sport {
    public Skeleton() {
        super();
    }

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " is very dangerous type of sport games. Do not play in such game");
    }

    @Override
    public void printInfo() {
        System.out.println("======" + this.getClass().getSimpleName() + " is Winter Olympic Game=====");
    }
}
