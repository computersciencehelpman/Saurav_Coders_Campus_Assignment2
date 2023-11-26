package com.coderscampus.assignment2;
import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
	
	public static void main(String[] args) {
		
		int numGuesses = 4; // There are 5 guesses but Java has a 0 base index
		int userGuess;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int theRandomNumber = rand.nextInt(100) +1; //The computer chooses a number between 1 and 100
		
		
		
		System.out.println("Enter a number between 1 and 100: ");
		userGuess = scan.nextInt();
		
		while(numGuesses > 0) {
			
			if(userGuess == theRandomNumber) { //The user wins if they guess the right number
				System.out.println("You win!");
				break;
			}
			
			else if(userGuess <1 || userGuess > 100) { //check if the guess is within bounds
				System.out.println("Your guess is not between 1 and 100, please try again: ");
				userGuess = scan.nextInt();

			}
			
			else if(userGuess > theRandomNumber) {
				numGuesses--;
				System.out.println("You have "+(numGuesses+1)+" guesses left.");
				System.out.println("Please pick a lower number");
				userGuess = scan.nextInt();
			}
			
			else if(userGuess < theRandomNumber) {
				numGuesses--;
				System.out.println("You have "+(numGuesses+1)+" guesses left.");
				System.out.println("Please pick a higher number");
				userGuess = scan.nextInt();
			}
			if(numGuesses == 0) {
				System.out.println("You have 0 guesses left.");				
				System.out.println("You lose, the number to guess was "+theRandomNumber);
			}
			
		}
		
		scan.close();
	}

}

