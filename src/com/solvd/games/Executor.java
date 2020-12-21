package com.solvd.games;
import java.util.List;
import java.util.Arrays;
import com.solvd.games.sportgames.*;

public class Executor {

    public static void main(String[] args) {

        Sport skeleton = new Skeleton();
        Sport biathlon = new Biathlon(5.26);
        Sport basketball = new Basketball("Basketball");
        Sport hockey = new Hockey("Canada");

        List<Sport> sports = Arrays.asList(skeleton, biathlon, basketball, hockey);
        for (Sport s : sports) {
            s.printInfo();
            s.play();
        }
    }
}   