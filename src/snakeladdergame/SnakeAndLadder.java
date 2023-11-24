package snakeladdergame;

import java.util.Random;

public class SnakeAndLadder {

    public static int checkOptn(Player player1, int diceVal){

        int currPos = player1.getCurrPos();
        Random random = new Random();
        int ranNum = random.nextInt(3);

        switch (ranNum){
            case 0:
                System.out.println("Oops, you can't move, it's a NO play");
                currPos += 0;
                break;
            case 1:
                System.out.println("yay, you got on a ladder");
                currPos += diceVal;
                break;
            case 2:
                System.out.println("You got bitten by a snake");
                if(currPos-diceVal<0){
                    currPos = 0;
                }else {currPos -= diceVal;}

        }
        return currPos;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the game");

        Player player1 = new Player();
        Dice dice = new Dice();
        System.out.println("Player1 your current position is: "+ player1.getCurrPos());

        while (player1.getCurrPos()<100){

            int diceVal = dice.rollDice();
            int currPos = checkOptn(player1, diceVal);
            System.out.println("Your current position is: "+currPos);
        }


    }
}
