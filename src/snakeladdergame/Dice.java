package snakeladdergame;

import java.util.Random;

public class Dice {
    public int rollDice(){
        Random ran = new Random();
        return ran.nextInt(6)+1;
    }
}
