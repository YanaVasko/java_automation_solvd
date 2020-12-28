package com.solvd.games.sportgames;	

public final class Canoeing extends SummerSportGames implements Sport {
    private String name;
    private String name1;

    public Canoeing() {
        super();
        this.name = "Unknown";
        this.name1 = "Unknown";
    }

    @Override
    public void printInfo() {
        System.out.println("Month of games: " + this.getMonthOfGames());
        if (this.name1 == "Unknown") {
            System.out.println("Name of champion: " + this.name);
        } else {
            System.out.println("Names of champions: " + this.name + ", " + this.name1);
        }
    }

    @Override
    public void play() {
        //
    }

    public void setChampionName(String name){
        this.name = name;
    }

    public void setChampionName(String name, String name1){
        this.name = name;
        this.name1 = name1;
    }

    public String getChampionName(){
        if (this.name1 == "Unknown") {
            return this.name;
        }
        return this.name+this.name1;
    }
}