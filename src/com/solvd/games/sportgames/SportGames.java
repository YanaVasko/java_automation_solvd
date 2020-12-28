package com.solvd.games.sportgames;

public class SportGames {
    private String winner;
    private int numOfMedals;
    private double record;
    private String monthOfGames;

    public SportGames() {
        this.winner = "Greece";
        this.numOfMedals = 0;
        this.record = 0;
        this.monthOfGames = "Unknown";
    }

    public SportGames(String winner) {
        this();
        this.winner = winner;
    }

    public SportGames(String winner, int numOfMedals, int record, String monthOfGames) {
        this.winner = winner;
        this.numOfMedals = numOfMedals;
        this.record = record;
        this.monthOfGames = monthOfGames;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinner() {
        return this.winner;
    }

    public void setNumOfMedals(int numOfMedals) {
        this.numOfMedals = numOfMedals;
    }

    public int getNumOfMedals() {
        return this.numOfMedals;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    public double getRecord() {
        return this.record;
    }

    public void setMonthOfGames(int month) {
        switch (month) {
            case 1: this.monthOfGames = "January";
                    break;
            case 2: this.monthOfGames = "February";
                    break;
            case 3: this.monthOfGames = "March";
                    break;
            case 4: this.monthOfGames = "April";
                    break;
            case 5: this.monthOfGames = "May";
                    break;
            case 6: this.monthOfGames = "June";
                    break;
            case 7: this.monthOfGames = "July";
                    break;
            case 8: this.monthOfGames = "August";
                    break;
            case 9: this.monthOfGames = "September";
                    break;
            case 10: this.monthOfGames = "October";
                     break;
            case 11: this.monthOfGames = "November";
                     break;
            case 12: this.monthOfGames = "December";
                     break;
            default: this.monthOfGames = "Invalid month";
                     break;
        }
    }

    public String getMonthOfGames() {
        return this.monthOfGames;
    }

    public void printFields() {
        System.out.println("Winner of the game: " + this.winner);
        System.out.println("Number of medals: " + this.numOfMedals);
        System.out.println("Word record: " + this.record);
        System.out.println("Month of games: " + this.monthOfGames);
    }
}
