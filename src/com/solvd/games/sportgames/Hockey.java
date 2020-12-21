package com.solvd.games.sportgames;

public class Hockey extends WinterSportGames implements Sport{
    
    private String country;

    public Hockey(String country) {
        this.country = country;
    }

    public Hockey() {
        super();
    }

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " is the national game of " + country + ". A lot of people play there in such game");
    }

    @Override
    public void printInfo() {
        System.out.println("======" + this.getClass().getSimpleName() + " is Winter Olympic Game=====");
    }
}
