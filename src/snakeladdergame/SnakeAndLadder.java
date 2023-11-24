package snakeladdergame;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the game");

        Player player1 = new Player();
        Dice dice = new Dice();
        System.out.println("Player1 your current position is: "+ player1.getCurrPos());

        while (player1.getCurrPos()<100){

            int diceVal = dice.rollDice();
        }


    }
}
