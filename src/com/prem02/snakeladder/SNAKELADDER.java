package com.prem02.snakeladder;

// WELCOME TO SNAKE AND LADDER PROGRAMME

/**
 * UC2 THE PLAYER ROLLS THE DIE TO GET A NUMBER BETWEEN 1 TO 6
 *
 * @author prem
 * @version 3.2
 * @since 10/08/2021
 *
 */

public class SNAKELADDER {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("WELCOME TO SNAKE AND LADDER PROGRAMME");
        System.out.println("You are at Starting Position::" + position);
        Dice();
    }

    public static void Dice(){
        int diceCheck = (int) Math.floor(Math.random() * 10) % 6+1;
        System.out.println("Dice Value::"+ diceCheck);
    }

}
