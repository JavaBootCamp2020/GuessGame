package net.gilsilva;//Author Gil Silva
import java.util.Scanner;

//Java Boot Camp
// Create a guessing game application



public class GuessingGame {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int randomNum = (int)(Math.random()*11);

        System.out.println("Guess a number from 1-10. \n(Enter -1 to quit)");


        int guess = 0;
        while (guess != randomNum && guess!= -1){

            System.out.println("Guess a number: ");
            guess = sc.nextInt();

            if(guess == randomNum){
                System.out.println(("Correct. The answer is " + randomNum));
            } else if(guess == -1) {
                System.out.println("You chose to end the game");
            }else if (guess > randomNum){
                System.out.println("Too high. Try a smaller number");
            } else{
                System.out.println("Too low. Try a bigger number");
            }
        } //end of loop

        System.out.println("Thank you for playing.");

	/*Alternative method for using random numbers
	import java.util.Random;
	Random randomNum = new Random();
	answer = randomNum.nextInt(10) + 1;

	 */


    }
}
