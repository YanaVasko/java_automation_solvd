package com.solvd.games.sportgames;

public class WinterSportGames extends SportGames {

    public static final String HOST_COUNTRY = "South Korea";
    private String hostCountry;
    private int yearOfGames;

    public WinterSportGames() {
        super();
    }

    public WinterSportGames(String winner) {
        super(winner);
        this.hostCountry = HOST_COUNTRY;
        this.yearOfGames = 2018;
    }

    public WinterSportGames(String winner, String hostCountry, int yearOfGames) {
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
