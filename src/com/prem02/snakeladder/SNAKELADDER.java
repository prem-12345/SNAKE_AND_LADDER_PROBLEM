package com.prem02.snakeladder;

// WELCOME TO SNAKE AND LADDER PROGRAMME

/**
 * UC3 THE PLAYER THEN CHECK FOR A OPTION.THEY ARE NO PLAY ,LADDER OR SNAKE
 *
 * @author prem
 * @version 3.3
 * @since 10/08/2021
 */

public class SNAKELADDER {
    public static void main(String[] args) {

        int position = 0;
        System.out.println("position is " + position);
        int die = (int) (Math.random() * 10) % 6 + 1;
        System.out.println("dice value is " + die);
        int value = (int) (Math.random() * 10) % 3 + 1;
        System.out.println("case number is " + value);

        switch (value) {
            case 1:
                System.out.println("No Play You are in the same position.");
                break;

            case 2:
                position = (position + die);
                System.out.println("your position after ladder is ::" + position);
                break;

            case 3:
                position = (position - die);
                System.out.println("Your Position after snake is::" + position);
                break;
        }
    }

}
