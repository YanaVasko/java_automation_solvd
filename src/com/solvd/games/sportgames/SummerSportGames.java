package com.solvd.games.sportgames;

public class SummerSportGames extends SportGames {

    private String hostCountry;
    private int yearOfGames;

    public SummerSportGames() {
        super();
    }

    public SummerSportGames(String winner) {
        super(winner);
        this.hostCountry = "Brazil";
        this.yearOfGames = 2016;
    }

    public SummerSportGames(String winner, String hostCountry, int yearOfGames) {
        super(winner);
        this.hostCountry = hostCountry;
        this.yearOfGames = yearOfGames;
    }

    public void setHostCountry(String hostCountry) {
        this.hostCountry = hostCountry;
    }

    public String getHostCountry() {
        return this.hostCountry;
    }

    public void setYearOfGames(int yearOfGames) {
        this.yearOfGames = yearOfGames;
    }

    public int getYearOfGames() {
        return this.yearOfGames;
    }

    @Override
    public void printFields() {
        super.printFields();
        System.out.println("Host country: " + this.hostCountry);
        System.out.println("Year of games: " + this.yearOfGames);
    }
}
