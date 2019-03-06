/**

 * Name: Tochi Iroakazi

 * Class: ICS4U

 * Defintion: This program runs rock, paper Scissors against the computer.

 */



import java.util.Random;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		System.out.println("Pick a choice: Rock = 1, Papper = 2 and Scissors = 3 ? ");

		Scanner userinput = new Scanner (System.in);

		int userchoice = userinput.nextInt();

		Random generatenumber = new Random();

		int computerchoice = generatenumber.nextInt(3) + 1;

		switch(computerchoice) {

		   case 1:

			   //rock

			   if (userchoice == 1) { // Rock vs Rock

				   System.out.println("Draw, the computer chose(Rock) " + computerchoice);

			   }else if (userchoice == 2) { // Rock vs Papper 

				   System.out.println("Win, the computer chose(Rock) " + computerchoice);

			   }else if (userchoice == 3) { // Rock vs Scissors

				   System.out.println("Lose, the computer chose(Rock) " + computerchoice);

			   }

			   break;

		   case 2:

			   //paper

			   if (userchoice == 1) { // paper vs Rock

				   System.out.println("Lose the computer chose(Paper) " + computerchoice);

			   }else if (userchoice == 2) { // paper vs paper

				   System.out.println("Draw, the computer chose(Paper) " + computerchoice);

			   }else if ( userchoice == 3) { // paper vs Scissors

				   System.out.println("Win, the computer chose(Paper) " + computerchoice);

			   }

			   break;

		   case 3:

			   // Scissors

			   if (userchoice == 1) { // Scissors vs Rock

				   System.out.println("Win,the computer chose(Scissors) " + computerchoice);

			   }else if (userchoice == 2) { // Scissors vs paper

				   System.out.println("Lose, the computer chose(Scissors) " + computerchoice);

			   }else if ( userchoice == 3) { // Scissors vs Scissors

				   System.out.println("Draw, the computer chose(Scissors) " + computerchoice);

			   }

			   break;

		}

	}



}
