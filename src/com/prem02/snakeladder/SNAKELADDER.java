package com.prem02.snakeladder;

// WELCOME TO SNAKE AND LADDER PROGRAMME

/**
 * UC5 ENSURE THE PLAYER GETS TO EXCAT WINNING POSITION 100
 *
 * @author prem
 * @version 3.5
 * @since 10/08/2021
 */

public class SNAKELADDER {
    public static void main(String[] args) {
        
        //Taking position variable for starting position and assign it zero
        int position = 0;
        System.out.println("position is " + position);
        
        //Taking diceValue variable for dice number by using random
        int diceValue = (int) (Math.random() * 10) % 6 + 1;
        
        //calling the class Utility
        Utility utility = new Utility();
        utility.playOption(position, diceValue);

    }
}

class Utility {

    public void playOption(int position, int diceValue) {

        //computation
        while (position <= 99) {

            int optionValue = (int) (Math.random() * 10) % 3 + 1;

            switch (optionValue) {
                case 1:
                    System.out.println("No Play....You are in the same position");
                    break;

                case 2:
                    position = (position + diceValue);
                    if (position > 100) {
                        position = (position - diceValue);
                        continue;
                    }
                    System.out.println("your position after ladder is :" + position);
                    break;

                case 3:
                    position = (position - diceValue);

                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Your Position after snake is" + position);
                    break;
            }
        }
    }

}
