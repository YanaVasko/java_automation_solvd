package com.solvd.games.sportgames;

public class Biathlon extends WinterSportGames implements Sport {

    private double firstPlaceSpeed;

    public Biathlon() {
        super();
    }
    
    public Biathlon(double firstPlaceSpeed) {
        this.firstPlaceSpeed = firstPlaceSpeed;
    }

    @Override
    public void play() {
        System.out.println("The top speed during this " + this.getClass().getSimpleName() + " competions was " + firstPlaceSpeed + " min");
    }

    @Override
    public void printInfo() {
        System.out.println("======" + this.getClass().getSimpleName() + " is Winter Olympic Game=====");
    }
}
