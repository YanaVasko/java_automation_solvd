package com.solvd.games.sportgames;

public class SportGames {
    private String winner;     
    private int numOfMedals; 
    private double record;

    public SportGames () {
        this.winner = "Greece";
        this.numOfMedals = 0; 
        this.record = 0;
    }

    public SportGames(String winner) {
        this();
        this.winner = winner;
    }

    public SportGames(String winner, int numOfMedals, int record) {
        this.winner = winner;
        this.numOfMedals = numOfMedals;
        this.record = record;
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
    public void printFields() {
        System.out.println("Winner of the game: " + this.winner);
        System.out.println("Number of medals: " + this.numOfMedals);
        System.out.println("Word record: " + this.record);
    }
}
