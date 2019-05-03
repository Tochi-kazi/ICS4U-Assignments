/**Name: Tochi Iroakazi
 * Subject: ICS4U
 * Description: This program Develops a symmetri pattern about n where each half before and after n is also symmetric around n-1.
 * 
 */


import java.util.Scanner;

public class RecursionB {

	public static void main(String[] args) {
		 System.out.println ( "What number do you want to use for the number pattern ?" );
		 System.out.println("Enter a positive integer below 15: ");
		 Scanner scanner = new Scanner(System.in);
		 
		 //check if the numbr ha san integer in it.
		 if(scanner.hasNextInt()) {
	            int userNum = scanner.nextInt();       
	            System.out.print(symmetricPattern(userNum));
	        }
	        else {
	            System.out.println("Error");
	        } 
		

	}
	public static String symmetricPattern(int num) {
        
        // make a variable to hold the text for where the whole pattern is contained (output)
        String output = "";
        // make a variable to hold the text for where the repetitions (1 2 1) is contained (nextOutput)
        String nextOuput;
        
        if(num >= 15 || num < 1) {
            // returns error if number is greater than/equal to 15 or number is less than 1
            return "Error";
        }else if(num == 1) {
        	//prints out " 1 " if number is 1
            return " 1 ";
        }else {
            // for numbers greater than one but less or equal to 15
            nextOuput = symmetricPattern(num - 1);
            // assign recursion to variable nextOutput so you don't need to type in that same line of code over and over
            if(num <= 5) {
                //if number is less than or equal to 5, let the output be assigned nextOuput (recursion) + number + nextOutput(recursion)
                output = nextOuput + num + nextOuput;
            }
            else {
                //if the number is greater than 5, do the same thing from if statement, except add a new line before the next recursion (new line after each int greater than 5)
                output = nextOuput + num + nextOuput;
            }
            //return output after if-else
            return output;
        }
    }

}
