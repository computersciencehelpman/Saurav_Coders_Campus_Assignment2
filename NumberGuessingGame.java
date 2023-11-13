package com.coderscampus.assignment2;
import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int numGuesses = 5;
		int theRandomNumber = rand.nextInt(100) +1;
		
		System.out.println("Enter a number between 1 and 100: ");
		int userGuess = scan.nextInt();
		
		
		
		
		while(numGuesses > 0) {
			
			if(userGuess<1 || userGuess>100) {
				System.out.println("Your guess is not between 1 and 100, please try again: ");
				userGuess = scan.nextInt();
			}
			if(userGuess != theRandomNumber) {
				System.out.println("You have " +(numGuesses-1)+" guesses left.");
			}
			
			if(userGuess < theRandomNumber) {
				System.out.println("Please pick a higher number: ");
				userGuess = scan.nextInt();
				numGuesses--;
			}
			else if(userGuess>theRandomNumber) {
				System.out.println("Please pick a lower number: ");
				userGuess = scan.nextInt();
				numGuesses--;
			}
			else if(userGuess == theRandomNumber){
				System.out.println("You win!");
				break;
			}
			
			if(numGuesses ==1){
				System.out.println("You have 0 guesses left.");
				System.out.println("You lose, the number to guess was "+theRandomNumber);
				break;
			}
			
		}
		
		scan.close();
	}

}
