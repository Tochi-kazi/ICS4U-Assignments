/******************************************************************

Made by: Tochi Iroakazi

Date: 14 February 2019

This program is a string blowup program. it multiplies the numbers by the letter followed and it deletes a number if there is nothing after it

********************************************************************/



import java.util.Scanner;

public class Stringblowup {

 public static void main(String args[]){ 

  

  //Asking user for an input

  System.out.println("Enter a string to blow up: ");

  Scanner userinput = new Scanner(System.in);

  StringBuffer buffer = new StringBuffer(18);

  

  //Assign values to variables

  int counter;

  int appenedingcounter;

  String usersfirststring = userinput.nextLine();

  char placeinstring;

  //char nextplaceinstring;

  

  // going through the string to check if the user typed in something

  for (counter = 0; counter < usersfirststring.length(); counter++) {

      //checking the first character to check if it a letter or digit

	  placeinstring = usersfirststring.charAt(counter);

	  //moving on to the next character to check if its a digit or number

    if (Character.isDigit(placeinstring) && counter < usersfirststring.length()-1) {

    	char nextplaceinstring = usersfirststring.charAt(counter + 1);    

     

    	if (!Character.isDigit(nextplaceinstring)){

    	   int repTimes = Integer.parseInt(Character.toString(placeinstring));

    	   for (appenedingcounter = 0; appenedingcounter < repTimes; appenedingcounter++) {

    	          buffer.append(nextplaceinstring);

    	   }

    	  } else {

    		  buffer.append(usersfirststring.charAt(counter+1)); //add the amount of letters the number is

    	  }

    } else {

    	buffer.append(placeinstring); //simply add if not digit

    }

  

     }

  System.out.println("Your blown up string is : " + buffer);

 }

}
