package com.solvd.games;

import com.solvd.games.sportgames.*;

public class Executor {

    public static void main(String[] args) {

        System.out.println("=====Sport Games======");
        SportGames sportGames = new SportGames();
        sportGames.printFields();

        System.out.println("=====Sport Games======");
        SportGames sportGames1 = new SportGames();
        sportGames1.setWinner("Agg");
        sportGames1.setNumOfMedals(12);
        sportGames1.setRecord(2.35);
        sportGames1.printFields();

        System.out.println("======Canoeing Summer Olimpic Game========");
        Canoeing canoeing1 = new Canoeing();
        canoeing1.printFields();

        System.out.println("======Hockey Winter Olimpic Game========");
        Hockey hockey1 = new Hockey("");
        hockey1.printFields();

        System.out.println("======Swimming Summer Olimpic Game========");
        Swimming swimming1 = new Swimming("Ukraine");
        swimming1.setNumOfMedals(10);
        swimming1.setRecord(10.55);
        swimming1.printFields();

        System.out.println("======Swimming2 Summer Olimpic Game========");
        Swimming swimming2 = new Swimming("USA");
        swimming2.printFields();

        System.out.println("======Basketball Summer Olimpic Game=====");
        Basketball basketball1 = new Basketball();
        basketball1.printFields();
        basketball1.play();
        basketball1.printInfo();

        System.out.println("======Skeleton Summer Olimpic Game=====");
        Skeleton skeleton = new Skeleton();
        skeleton.printFields();
        skeleton.play();
        skeleton.printInfo();

        System.out.println(skeleton.getPrize());

        System.out.println("======Artistic Gymnastic=====");
        ArtisticGymnastic artgym = new ArtisticGymnastic();
        artgym.printFields();
        artgym.setScore(5);
        artgym.printFields();

    }
}